package com.nba.server;

import com.nba.mapper.CompetitionDAO;
import com.nba.model.Competition;
import com.nba.model.CompetitionExample;
import com.nba.model.Games;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Max;
import java.util.List;

@Service
public class CompetitionService {
    @Autowired
    CompetitionDAO competitionDAO;

    /**
     * 根据比赛创建
     * @param games
     * @return
     */
    public Integer insertOrUpdateCompetition(Games games){
        //查找当前比赛的竞猜是否存在，不存在则生成一个竞猜
        CompetitionExample example = new CompetitionExample();
        CompetitionExample.Criteria criteria = example.createCriteria();
        criteria.andGameIdEqualTo(games.getGameId());
        List<Competition> competitionList = competitionDAO.selectByExample(example);

        if(competitionList.isEmpty()){
            //插入
        }else {
            /**
             * 判定Game的状态是否有变化
             * 1.如果比赛的状态是结束，竞猜的状态不是，则更新竞猜的状态
             * 2.如果比赛的状态是进行中，竞猜的状态不是则将竞猜额状态更新
             */
        }
        return null;
    }
}
