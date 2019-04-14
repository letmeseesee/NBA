package com.nba.server;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.io.IOException;
@PropertySource("classpath:application.properties")
@Service
public class GetGamesService {
    private Logger logger = LoggerFactory.getLogger(GetGamesService.class);

    @Value("${fantasy.url}")
    private String baseUrl;

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
    /**
     * 根据日期查询比赛
     * @param date
     */
    public void getGameByTime(String date) {

    }

    /**
     * 查询当前正在进行中的比赛
     */
    public void getCurrentGame(){

    }

    /**
     * 获取所有新闻
     */
    public void getNews() {
        String url = baseUrl + getNewsUrl;
        String content = curlGet(url);
        logger.info(content);
    }

    /**
     * 根据日期获取新闻
     * @param date
     */
    public void getNewsByDate(String date) {
        String url = baseUrl + getNewsByDateUrl + date;
        String content = curlGet(url);
        logger.info(content);
    }

    /**
     * 获取所有的球队
     */
    public void getAllTeams(){
        String url = baseUrl + getAllTeamsUrl;
        String content = curlGet(url);
        logger.info(content);
    }

    /**
     * 获取所有的球队
     */
    public void getPlayers(){
        String url = baseUrl + getPlayersUrl;
        String content = curlGet(url);
        logger.info(content);
    }


    /**
     * 获取所有的比赛-----一年执行一次
     */
    public void getGamesByDate(String date){
        String url = baseUrl + getTimeLine + date;
        String content = curlGet(url);
        logger.info(content);
    }

    private String curlGet(String url){
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
        }catch (IOException e){
            e.getStackTrace();
            return null;
        }finally {
            try {
                response.close();
                httpGet.abort();
                httpClient.close();
            }catch (NullPointerException e){
                e.printStackTrace();
            }catch (Exception e){
                e.getStackTrace();
            }
        }
    }
}
