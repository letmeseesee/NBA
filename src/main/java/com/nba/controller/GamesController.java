package com.nba.controller;

import com.nba.facade.api.GamesApi;
import com.nba.facade.dto.LastGameDot;
import com.nba.server.BaseService;
import com.nba.server.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class GamesController implements GamesApi {
    @Autowired
    GameService gameService;

    @Autowired
    BaseService baseService;
    @Override
    public String gamesList(Model model) {
        //设置当前用户
        baseService.setUser(model);

        //获取最新的100个比赛
        List<LastGameDot> gameDotList = gameService.getLastGames(20);
        model.addAttribute("gamesList",gameDotList);
        return "games/list";
    }

    @Override
    public String gamesList(Integer id, Model model) {

        return "games/detail";
    }
}
