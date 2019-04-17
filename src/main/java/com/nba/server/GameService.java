package com.nba.server;

import com.nba.facade.dto.LastGameDot;
import com.nba.mapper.GamesDAO;
import com.nba.model.Games;
import com.nba.model.GamesExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
