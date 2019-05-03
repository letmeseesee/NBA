package com.nba.server;

import com.nba.facade.dto.TeamsDto;
import com.nba.mapper.GamesDAO;
import com.nba.mapper.NewsDAO;
import com.nba.mapper.PlayersDAO;
import com.nba.mapper.TeamsDAO;
import com.nba.model.*;
import com.nba.status.GameStatusEnum;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class GamesAsynTaskService {
    private Logger logger = LoggerFactory.getLogger(GetGamesService.class);

    @Autowired
    NewsDAO newsDAO;

    @Autowired
    PlayersDAO playersDAO;

    @Autowired
    TeamsDAO teamsDAO;

    @Autowired
    GamesDAO gamesDAO;

    @Autowired
    QuarterService  quarterService;

    @Autowired
    GameDetailService gameDetailService;

    @Autowired
    CompetitionService competitionService;

    @Autowired
    ThreadService threadService;

    @Autowired
    FollowService followService;

    /**
     * 新闻
     * @param news
     */
    @Async("GameAnsycExecutor")
    public void saveNews(News news){
        //判断该数据是否在数据库总存在
        NewsExample newsExample = new NewsExample();
        NewsExample.Criteria criteria = newsExample.createCriteria();
        criteria.andNewsIdEqualTo(news.getNewsId());
        Long newsCount = newsDAO.countByExample(newsExample);
        if(newsCount == 0){
            try {
                newsDAO.insert(news);
                logger.info(news.toString());
            }catch (Exception e){
                logger.warn("插入数据失败！");
            }
        }
    }

    /**
     * 球员
     * @param players
     */
    @Async("GameAnsycExecutor")
    public void savePlayer(Players players){
        //查询当前是否存在该运动员
        PlayersExample playersExample = new PlayersExample();
        PlayersExample.Criteria criteria = playersExample.createCriteria();
        criteria.andPlayerIdEqualTo(players.getPlayerId());
        if(playersDAO.countByExample(playersExample) > 0){
          //判断是否要更新
            Players OldPlayer = playersDAO.selectByExample(playersExample).get(0);
            if(!OldPlayer.equals(players)){
                playersDAO.updateByExample(players,playersExample);
                logger.info("更新球员{}的信息",players.getFirstName());
            } else {
               logger.info("球员{}的信息一致不更新",players.getFirstName());
            }
        } else {
            playersDAO.insert(players);
            logger.info("插入球员{}的信息",players.getFirstName());
        }
    }


    /**
     * 球队
     * @param teamsDto
     */
    @Async("GameAnsycExecutor")
    public void saveTeam(TeamsDto teamsDto){
        Teams teams = new Teams();
        if(teamsDto.getActive()){
            teams.setActive((byte)1);
        }else {
            teams.setActive((byte)0);
        }
        teams.setCity(teamsDto.getCity());
        teams.setTeamId(teamsDto.getTeamId());
        teams.setKey(teamsDto.getKey());
        teams.setName(teamsDto.getName());
        teams.setLeagueId(teamsDto.getLeagueId());
        teams.setStadiumId(teamsDto.getStadiumId());
        teams.setConference(teamsDto.getConference());
        teams.setDivision(teamsDto.getDivision());
        teams.setPrimaryColor(teamsDto.getPrimaryColor());
        teams.setSecondaryColor(teamsDto.getSecondaryColor());
        teams.setTertiaryColor(teamsDto.getTertiaryColor());
        teams.setQuaternaryColor(teamsDto.getQuaternaryColor());
        teams.setWikipediaLogoUrl(teamsDto.getWikipediaLogoUrl());
        teams.setWikipediaWordMarkUrl(teamsDto.getWikipediaWordMarkUrl());
        teams.setGlobalTeamId(teamsDto.getGlobalTeamId());

        //查询当前是否存在该运动员
        TeamsExample teamsExample = new TeamsExample();
        TeamsExample.Criteria criteria = teamsExample.createCriteria();
        criteria.andTeamIdEqualTo(teams.getTeamId());
        if(teamsDAO.countByExample(teamsExample) > 0){
            //判断是否要更新
            Teams oldTeams = teamsDAO.selectByExample(teamsExample).get(0);
            if(!oldTeams.equals(teams)){
                teamsDAO.updateByExample(teams,teamsExample);
                logger.info("更新球队{}的信息",teams.getName());
            } else {
                logger.info("球队{}的信息一致不更新",teams.getName());
            }
        } else {
            teamsDAO.insert(teams);
            logger.info("插入球队{}的信息",teams.getName());
        }
    }

    /**
     * 比赛
     * @param games
     */
    @Transactional(rollbackFor = Exception.class)
    public void saveGames(Games games){
        //查询当前是否存改比赛
        GamesExample gamesExample = new GamesExample();
        GamesExample.Criteria criteria = gamesExample.createCriteria();
        criteria.andGameIdEqualTo(games.getGameId());
        if(gamesDAO.countByExample(gamesExample) > 0){
            //判断是否要更新
            Games oldGames = gamesDAO.selectByExample(gamesExample).get(0);
            if(!oldGames.equals(games)){
                gamesDAO.updateByExample(games,gamesExample);
                logger.info("更新比赛{} VS {}的信息",games.getHomeTeam(),games.getAwayTeam());
                //结算
                competitionService.insertOrUpdateCompetition(games);
                //发送提醒邮件
                if(games.getStatus().equals(GameStatusEnum.STARTING.getDescription())){
                    followService.sendNoticeMail(games.getGameId());
                }
            } else {
                logger.info("比赛{} VS {}的信息一致不更新",games.getHomeTeam(),games.getAwayTeam());
            }
        } else {
            //如果当前比赛是NOT_START或者STARTING则生产竞猜信息
            gamesDAO.insert(games);
            //插入竞猜和话题
            competitionService.insertOrUpdateCompetition(games);
            threadService.createGameThread(games);
            logger.info("插入比赛{} VS {}的信息",games.getHomeTeam(),games.getAwayTeam());
        }
    }

    @Transactional
    void saveQuarters(List<Quarters> quartersList){
        //查询当前是否存改比赛
       for (Quarters quarter:quartersList){
           //
           Quarters oldQuter = quarterService.getQutersById(quarter.getQuarterId());
           if(oldQuter != null) {
               if (!oldQuter.equals(quarter)) {
                   quarterService.updateByQuter(quarter);
                   logger.info("更新quarter的信息",quarter.getQuarterId());
               }else {
                   logger.info("无需更新quarter的信息",quarter.getQuarterId());
               }
           }else {
               quarterService.insertByQuter(quarter);
               logger.info("插入quarter的信息",quarter.getQuarterId());
           }
       }
    }

    @Transactional
    void saveGameDetail(List<GameDetail> gameDetailList){
        List<GameDetail> notExistDetail = new ArrayList<>();
        //查询当前是否存改比赛
        for (GameDetail detail:gameDetailList){
            //
            if(gameDetailService.selectByPrimary(detail.getPlayId()) == null) {
                notExistDetail.add(detail);
            }
        }
        if(notExistDetail.size() > 0){
            gameDetailService.batchInsertDetail(notExistDetail);
        }else {
            logger.info("比赛详情无需更新");
        }
    }

}
