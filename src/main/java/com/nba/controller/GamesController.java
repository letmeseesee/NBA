package com.nba.controller;

import com.nba.facade.api.GamesApi;
import com.nba.facade.dto.LastGameDot;
import com.nba.model.GameDetail;
import com.nba.server.BaseService;
import com.nba.server.FollowService;
import com.nba.server.GameDetailService;
import com.nba.server.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class GamesController implements GamesApi {
    @Autowired
    GameService gameService;

    @Autowired
    BaseService baseService;

    @Autowired
    GameDetailService gameDetailService;

    @Autowired
    FollowService followService;

    @Override
    public String gamesList(Model model) {
        //设置当前用户
        baseService.setUser(model);

        //获取最新的100个比赛
        List<LastGameDot> gameDotList = gameService.getLastGames(20);
        //取得当前用户关注的比赛
        List<Integer> gameIdList = gameDotList.stream().map(LastGameDot::getGameId).collect(Collectors.toList());
        gameIdList = followService.getFollowedGames(gameIdList);
        HashMap<Integer, Integer> gameIdMap = new HashMap<>();
        if(gameIdList!=null && !gameIdList.isEmpty()) {
            for (Integer game_id : gameIdList) {
                gameIdMap.put(game_id, game_id);
            }
        }
        model.addAttribute("gameIdMap", gameIdMap);
        model.addAttribute("gamesList",gameDotList);
        return "games/list";
    }

    @Override
    public String gamesDetail(Integer id, Model model) {
        //获取比赛信息
        LastGameDot game = gameService.getGame(id);
        //计算支持率
        Double calculate = gameService.calculateSupport(game.getHomeTeamMoneyLine(),game.getAwayTeamMoneyLine());
        //获取比赛详情
        List<GameDetail> gameDetailList = gameDetailService.getGameDetailListByGame(id);

        model.addAttribute("calculate",calculate);
        model.addAttribute("game",game);
        model.addAttribute("gameDetailList",gameDetailList);

        return "games/detail";
    }
}
