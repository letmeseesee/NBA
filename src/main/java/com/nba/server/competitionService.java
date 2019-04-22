package com.nba.server;

import com.nba.mapper.CompetitionDAO;
import com.nba.model.Games;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class competitionService {
    @Autowired
    CompetitionDAO competitionDAO;

    /**
     * 根据比赛创建
     * @param games
     * @return
     */
    public Integer insertCompetition(Games games){
        return null;
    }
}
