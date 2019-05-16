package com.nba.server;

import com.nba.mapper.TeamsDAO;
import com.nba.model.Teams;
import com.nba.model.TeamsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    @Autowired
    TeamsDAO teamsDAO;

    public List<Teams> getTeam(){
        TeamsExample teamsExample = new TeamsExample();
        return teamsDAO.selectByExample(teamsExample);
    }

    public Teams getTeam(Integer id){
        return teamsDAO.selectByPrimaryKey(id);
    }
}
