package com.nba.controller;

import com.nba.facade.api.PlayerApi;
import com.nba.facade.dto.BbsThreadDto;
import com.nba.facade.dto.LastGameDot;
import com.nba.model.News;
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
public class PlayerController implements PlayerApi {
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
        List<Players> players = playerService.getPlayers();

        model.addAttribute("players",players);
        return "player/mainPage";
    }

    @Override
    public String gamesDetail(Integer id, Model model) {
        //设置当前用户
        baseService.setUser(model);

        Players player = playerService.getPlayers(id);

        //获取球队
        Teams team = teamService.getTeam(player.getTeamId());

        model.addAttribute("player",player);
        model.addAttribute("team",team);
        return "player/detail";
    }
}
