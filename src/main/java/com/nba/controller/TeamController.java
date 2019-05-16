package com.nba.controller;

import com.nba.facade.api.TeamApi;
import com.nba.model.Players;
import com.nba.model.Teams;
import com.nba.server.BaseService;
import com.nba.server.PlayerService;
import com.nba.server.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class TeamController implements TeamApi {
    @Autowired
    PlayerService playerService;

    @Autowired
    TeamService teamService;

    @Autowired
    BaseService baseService;

    @Override
    public String gamesList(Model model) {
        //设置当前用户
        baseService.setUser(model);

        //获取最新的比赛
        List<Teams> teamsList = teamService.getTeam();

        model.addAttribute("teamsList",teamsList);
        return "team/mainPage";
    }

    @Override
    public String gamesDetail(Integer id, Model model) {
        //设置当前用户
        baseService.setUser(model);

        //获取球队
        Teams team = teamService.getTeam(id);

        //队员
        List<Players> players = playerService.getPlayersByTeam(team.getTeamId());

        model.addAttribute("players",players);
        model.addAttribute("team",team);
        return "team/detail";
    }
}
