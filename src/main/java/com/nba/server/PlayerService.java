package com.nba.server;

import com.nba.mapper.PlayersDAO;
import com.nba.model.GamesExample;
import com.nba.model.Players;
import com.nba.model.PlayersExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    PlayersDAO playersDAO;

    public List<Players> getPlayers(){
        PlayersExample playersExample = new PlayersExample();
        return playersDAO.selectByExample(playersExample);
    }


    public Players getPlayers(Integer id){
        return playersDAO.selectByPrimaryKey(id);
    }


    public List<Players> getPlayers(String keyword){
        PlayersExample playersExample = new PlayersExample();
        PlayersExample.Criteria criteria = playersExample.createCriteria();
        criteria.andFirstNameLike('%' +keyword + '%');
        playersExample.or(criteria);
        PlayersExample.Criteria criteria1 = playersExample.createCriteria();
        criteria1.andLastNameLike('%' +keyword + '%');
        playersExample.or(criteria1);
        return playersDAO.selectByExample(playersExample);
    }

    public List<Players> getPlayersByTeam(Integer teamId){
        PlayersExample playersExample = new PlayersExample();
        PlayersExample.Criteria criteria = playersExample.createCriteria();
        criteria.andTeamIdEqualTo(teamId);
        return playersDAO.selectByExample(playersExample);
    }
}
