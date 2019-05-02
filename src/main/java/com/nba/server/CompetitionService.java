package com.nba.server;

import com.nba.mapper.CompetitionDAO;
import com.nba.mapper.CompetitionListDAO;
import com.nba.mapper.UserDAO;
import com.nba.model.*;
import com.nba.status.CompetitionEnum;
import com.nba.status.GameStatusEnum;
import org.apache.commons.collections4.bag.CollectionSortedBag;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.Max;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class CompetitionService {
    private Logger logger = LoggerFactory.getLogger(GetGamesService.class);

    @Autowired
    CompetitionDAO competitionDAO;

    @Autowired
    CompetitionListDAO competitionListDAO;

    @Autowired
    UserDAO userDAO;

    @Autowired
    CompetitionService competitionService;

    /**
     * 根据比赛创建
     * @param games
     * @return
     */
    @Transactional
    public Integer insertOrUpdateCompetition(Games games){
        //查找当前比赛的竞猜是否存在，不存在则生成一个竞猜
        CompetitionExample example = new CompetitionExample();
        CompetitionExample.Criteria criteria = example.createCriteria();
        criteria.andGameIdEqualTo(games.getGameId());
        List<Competition> competitionList = competitionDAO.selectByExample(example);
        logger.info("处理比赛{}的竞猜",games.getGameId());
        if(competitionList.isEmpty()){
            //生成比赛对应的竞猜
            if(games.getStatus() == GameStatusEnum.code2Desc((byte) 1) ||
                    games.getStatus() == GameStatusEnum.code2Desc((byte) 2)){
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Competition competition = new Competition();
                competition.setGameId(games.getGameId());
                competition.setAwayTeamId(games.getAwayTeamId());
                competition.setHomeTeamId(games.getHomeTeamId());
                competition.setHomeTeamOfficalSupport(games.getHomeTeamMoneyLine());
                competition.setAwayTeamOfficalSupport(games.getAwayTeamMoneyLine());
                competition.setHomeTeamSupport(0);
                competition.setAwayTeamSupport(0);
                competition.setAddTime(new Date());
                if(games.getStatus() == GameStatusEnum.code2Desc((byte) 1)){
                    competition.setStatus(CompetitionEnum.NOT_START.getCode().intValue());
                }else {
                    competition.setStatus(CompetitionEnum.STARTING.getCode().intValue());
                }
                competitionDAO.insert(competition);
                logger.info("添加比赛{}的竞猜",games.getGameId());
            }
        }else {
            Competition competition = competitionList.get(0);
            /**
             * 判定Game的状态是否有变化
             * 1.如果比赛的状态是结束，竞猜的状态不是，则更新竞猜的状态
             * 2.如果比赛的状态是进行中，竞猜的状态不是则将竞猜额状态更新
             */
            //如果比赛已经结束但是竞猜还没有，则更新竞猜的状态
            if(StringUtils.equals(games.getStatus(),GameStatusEnum.CLOSE.getDescription())
                    || StringUtils.equals(games.getStatus(),GameStatusEnum.Canceled.getDescription())
                    || StringUtils.equals(games.getStatus(),GameStatusEnum.FOT.getDescription())){
                if(competition.getStatus() != CompetitionEnum.CLOSE.getCode().intValue()) {
                    competition.setStatus(CompetitionEnum.CLOSE.getCode().intValue());
                    competitionDAO.updateByPrimaryKeySelective(competition);
                    //结算竞猜金额（赢了的积分加一，输了的积分减一）
                    competitionService.finishCompetition(games);
                    logger.info("结算比赛{}的竞猜",games.getGameId());
                }
            }

                //如果比赛已经开始但是竞猜没有则更新竞猜的状态
            if (StringUtils.equals(games.getStatus(),GameStatusEnum.STARTING.getDescription())
            ||StringUtils.equals(games.getStatus(),GameStatusEnum.Suspended.getDescription())
            ||StringUtils.equals(games.getStatus(),GameStatusEnum.Postponed.getDescription())){
                if(competition.getStatus() != CompetitionEnum.STARTING.getCode().intValue()){
                    competition.setStatus(CompetitionEnum.STARTING.getCode().intValue());
                    competitionDAO.updateByPrimaryKeySelective(competition);
                    logger.info("开启比赛{}的竞猜",games.getGameId());
                }
            }

            //比赛取消返还积分
            if(StringUtils.equals(games.getStatus(),GameStatusEnum.Canceled.getDescription())){
                if(competition.getStatus() != CompetitionEnum.CANCELED.getCode().intValue()) {
                    competition.setStatus(CompetitionEnum.CANCELED.getCode().intValue());
                    competitionDAO.updateByPrimaryKeySelective(competition);
                    //结算竞猜金额
                    competitionService.cancelCompetition(games);
                    logger.info("取消比赛{}的竞猜",games.getGameId());
                }
            }
        }
        return null;
    }


    @Transactional
    public Boolean finishCompetition(Games games){

        //根据比赛ID获取竞猜获胜
        Integer winTeamId = 0;
        if(games.getAwayTeamScore() > games.getHomeTeamScore()){
            winTeamId = games.getAwayTeamId();
        }

        if(games.getAwayTeamScore() < games.getHomeTeamScore()){
            winTeamId = games.getHomeTeamId();
        }

        //查找当前比赛的竞猜是否存在，不存在则生成一个竞猜
        CompetitionExample example = new CompetitionExample();
        CompetitionExample.Criteria criteria = example.createCriteria();
        criteria.andGameIdEqualTo(games.getGameId());
        Competition competition = competitionDAO.selectByExample(example).get(0);

        CompetitionListExample competitionListExample = new CompetitionListExample();
        CompetitionListExample.Criteria criteria1List = competitionListExample.createCriteria();
        criteria1List.andCompetitionIdEqualTo(competition.getCompetitionId());
        List<CompetitionList> competitionLists =
                competitionListDAO.selectByExample(competitionListExample);
        List<Integer> winUserArr = new ArrayList<>();
        List<Integer> loseUserArr = new ArrayList<>();
        for (CompetitionList competitionList:competitionLists) {
            if(competitionList.getTeamAside().equals(winTeamId)){
                winUserArr.add(competitionList.getUid());
            } else {
                loseUserArr.add(competitionList.getUid());
            }
        }

        //加二积分,输的用户的积分不返还
        if(winUserArr.size() > 0){
            User user;
            for (Integer uid:winUserArr) {
                user = userDAO.selectByPrimaryKey(uid);
                user.setGolds(user.getGolds() + 2);
                userDAO.updateByPrimaryKey(user);
            }
        }
        return true;
    }

    @Transactional
    public Boolean cancelCompetition(Games games){
        //查找当前比赛的竞猜
        CompetitionExample example = new CompetitionExample();
        CompetitionExample.Criteria criteria = example.createCriteria();
        criteria.andGameIdEqualTo(games.getGameId());
        Competition competition = competitionDAO.selectByExample(example).get(0);

        CompetitionListExample competitionListExample = new CompetitionListExample();
        CompetitionListExample.Criteria criteria1List = competitionListExample.createCriteria();
        criteria1List.andCompetitionIdEqualTo(competition.getCompetitionId());
        List<CompetitionList> competitionLists =
                competitionListDAO.selectByExample(competitionListExample);

        //返还积分
        if(!competitionLists.isEmpty()){
            User user;
            for (CompetitionList competitionList:competitionLists) {
                user = userDAO.selectByPrimaryKey(competitionList.getUid());
                user.setGolds(user.getGolds() + 1);
                userDAO.updateByPrimaryKey(user);
            }
        }
        return true;
    }
}
