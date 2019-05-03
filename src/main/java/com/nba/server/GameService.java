package com.nba.server;

import com.nba.facade.dto.LastGameDot;
import com.nba.mapper.GamesDAO;
import com.nba.model.Games;
import com.nba.model.GamesExample;
import com.nba.status.GameStatusEnum;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {
    @Autowired
    GamesDAO gamesDAO;

    /**
     * 获取最新的比赛
     * @return
     */
    public List<LastGameDot> getLastGames(){
        GamesExample gamesExample = new GamesExample();
        GamesExample.Criteria criteria = gamesExample.createCriteria();
        gamesExample.setOrderByClause("game_id desc");
        gamesExample.setOffset((long)0);
        gamesExample.setLimit(10);
        return gamesDAO.selectByExampleJoinTeam(gamesExample);
    }

    /**
     * 获取最新的比赛
     * @return
     */
    public List<LastGameDot> getLastGames(String keyword){
        GamesExample gamesExample = new GamesExample();
        GamesExample.Criteria criteria = gamesExample.createCriteria();
        criteria.andAwayTeamLike('%' +keyword + '%');
        gamesExample.or(criteria);
        GamesExample.Criteria criteria1 = gamesExample.createCriteria();
        criteria1.andHomeTeamLike('%' +keyword + '%');
        gamesExample.or(criteria1);
        gamesExample.setOrderByClause("game_id desc");
        gamesExample.setOffset((long)0);
        gamesExample.setLimit(10);
        return gamesDAO.selectByExampleJoinTeam(gamesExample);
    }


    /**
     * 获取最新的比赛
     * @return List<LastGameDot>
     */
    public List<LastGameDot> getLastGames(int size){
        GamesExample gamesExample = new GamesExample();
        GamesExample.Criteria criteria = gamesExample.createCriteria();
        gamesExample.setOrderByClause("game_id desc");
        gamesExample.setOffset((long)0);
        gamesExample.setLimit(size);
        return gamesDAO.selectByExampleJoinTeam(gamesExample);
    }

    /**
     * 获取比赛
     * @return LastGameDot
     */
    public LastGameDot getGame(int id){
        GamesExample gamesExample = new GamesExample();
        GamesExample.Criteria criteria = gamesExample.createCriteria();
        criteria.andGameIdEqualTo(id);
        List<LastGameDot> lastGameDots = gamesDAO.selectByExampleJoinTeam(gamesExample);
        if(lastGameDots.isEmpty()){
            return null;
        }else {
            return lastGameDots.get(0);
        }
    }
    /**
     * 获取所有未结束的比赛的信息
     * @return List<LastGameDot>
     */
    public List<Games> getNotFinishGames(){
        GamesExample gamesExample = new GamesExample();
        GamesExample.Criteria criteria = gamesExample.createCriteria();
        List<String> notFinsishStatus = new ArrayList<>();
        notFinsishStatus.add(GameStatusEnum.NOT_START.getDescription());
        notFinsishStatus.add(GameStatusEnum.STARTING.getDescription());
        notFinsishStatus.add(GameStatusEnum.Suspended.getDescription());
        notFinsishStatus.add(GameStatusEnum.Postponed.getDescription());
        criteria.andStatusIn(notFinsishStatus);
        gamesExample.setOrderByClause("game_id desc");
        return gamesDAO.selectByExample(gamesExample);
    }

    public Double calculateSupport(Double Home, Double Away){
        Double total = Math.abs(Home) + Math.abs(Away);
        return Math.abs(Home)/total * 100;
    }
}
