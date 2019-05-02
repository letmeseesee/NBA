package com.nba.server;

import com.alibaba.fastjson.JSON;
import com.nba.facade.dto.LastGameDot;
import com.nba.facade.dto.PlayByPlayDto;
import com.nba.facade.dto.TeamsDto;
import com.nba.mapper.TeamsDAO;
import com.nba.model.Games;
import com.nba.model.News;
import com.nba.model.Players;
import com.nba.model.Teams;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

@PropertySource("classpath:application.properties")
@Service
public class GetGamesService {
    private Logger logger = LoggerFactory.getLogger(GetGamesService.class);

    @Value("${fantasy.url}")
    private String baseUrl;

    @Value("${fantasy.url}")
    private String sportsdataUrl;

    @Value("${fantasy.key}")
    private String key;

    @Value("${fantasy.getGamesUrl}")
    private String getGamesUrl;


    @Value("${fantasy.getNewsUrl}")
    private String getNewsUrl;

    @Value("${fantasy.getNewsByDate}")
    private String getNewsByDateUrl;

    @Value("${fantasy.getAllTeams}")
    private String getAllTeamsUrl;

    @Value("${fantasy.getPlayers}")
    private String getPlayersUrl;

    @Value("${fantasy.getTimeLine}")
    private String getTimeLine;

    @Value("${fantasy.PlayByPlay}")
    private String PlayByPlayUrl;

    @Autowired
    GamesAsynTaskService gamesAsynTaskService;

    /**
     * 获取所有新闻
     */
    public void getNews() {
        String url = baseUrl + getNewsUrl;
        String content = curlGet(url);
        logger.info(content);
        //将获取的新闻保存到数据库中
        try {
            List<News> newsList = JSON.parseArray(content, News.class);
            newsList.parallelStream().forEach((news -> {
                gamesAsynTaskService.saveNews(news);
            }));
        } catch (Exception e) {
            logger.warn(e.getMessage());
        }
    }

    /**
     * 根据日期获取新闻
     *
     * @param date
     */
    public void getNewsByDate(String date) {
        String url = baseUrl + getNewsByDateUrl + date;
        logger.info("从地址{}获取新闻信息", url);
        String content = curlGet(url);
        logger.info(content);
        //将获取的新闻
        //将获取的新闻保存到数据库中
        try {
            List<News> newsList = JSON.parseArray(content, News.class);
            newsList.parallelStream().forEach((news -> {
                gamesAsynTaskService.saveNews(news);
            }));
        } catch (Exception e) {
            logger.warn(e.getMessage());
        }
    }


    /**
     * 获取所有的球员
     */
    public void getPlayers() {
        String url = baseUrl + getPlayersUrl;
        String content = curlGet(url);
        logger.info(content);
        try {
            List<Players> playersList = JSON.parseArray(content, Players.class);
            playersList.parallelStream().forEach((player -> {
                gamesAsynTaskService.savePlayer(player);
            }));
        } catch (Exception e) {
            logger.warn(e.getMessage());
        }
    }

    /**
     * 获取所有的球队
     */
    public void getAllTeams() {
        String url = baseUrl + getAllTeamsUrl;
        logger.info("从地址{}获取球队信息", url);
        String teamContent = curlGet(url);
        logger.info(teamContent);
        try {
            List<TeamsDto> teamsList = JSON.parseArray(teamContent, TeamsDto.class);
            teamsList.parallelStream().forEach((teams -> {
                gamesAsynTaskService.saveTeam(teams);
            }));
        } catch (Exception e) {
            logger.warn(e.getMessage());
        }
    }

    /**
     * 获取所有的比赛
     */
    public void getGamesByDate(String date) {
        String url = baseUrl + getTimeLine + date;
        String content = curlGet(url);
        logger.info(content);
        try {
            List<Games> gamesList = JSON.parseArray(content, Games.class);
            gamesList.parallelStream().forEach((games ->
            {
                gamesAsynTaskService.saveGames(games);
            }));
        } catch (Exception e) {
            logger.warn(e.getMessage());
        }
    }

    /**
     * 获取比赛详情,并更新比赛信息
     *
     * @param gameId 比赛id
     */
//    @Async("GameAnsycExecutor")
    @Transactional(rollbackFor = Exception.class)
    public void PlayByPlayByGameId(Integer gameId) {
        String url = sportsdataUrl + PlayByPlayUrl + gameId;
        logger.info("从地址{}获取比赛详情", url);
        String sportsContent = curlGet(url);
        logger.info(sportsContent);
        PlayByPlayDto playByPlayDto = JSON.parseObject(sportsContent, PlayByPlayDto.class);
        //保存节信息
        gamesAsynTaskService.saveQuarters(playByPlayDto.getQuarters());
        //保存比赛明细
        gamesAsynTaskService.saveGameDetail(playByPlayDto.getPlays());
        //保存比赛信息
        gamesAsynTaskService.saveGames(playByPlayDto.getGame());

    }

    private String curlGet(String url) {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //请求地址设置
        HttpGet httpGet = new HttpGet(url);
        httpGet.setHeader("Ocp-Apim-Subscription-Key", key);
        //设置请求配置
        RequestConfig requestConfig = RequestConfig
                .custom()
                .setConnectTimeout(30000)
                .setMaxRedirects(5)
                .setConnectionRequestTimeout(6000)
                .build();
        httpGet.setConfig(requestConfig);

        //设置请求返回值
        CloseableHttpResponse response = null;
        //请求
        try {
            //设置请求体
            String content;
            response = httpClient.execute(httpGet);
            HttpEntity httpEntity = response.getEntity();
            content = EntityUtils.toString(httpEntity, HTTP.UTF_8);
            return content;
        } catch (IOException e) {
            e.getStackTrace();
            return null;
        } finally {
            try {
                response.close();
                httpGet.abort();
                httpClient.close();
            } catch (NullPointerException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
}
