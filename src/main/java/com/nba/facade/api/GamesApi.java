package com.nba.facade.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Api(value = "比赛页面", tags = "GamesApi")
public interface GamesApi {
    @ApiOperation(value = "比赛列表页")
    @RequestMapping(value = "/games/list",method = RequestMethod.GET)
    String gamesList(Model model);

    @ApiOperation(value = "比赛详细页")
    @RequestMapping(value = "/games/detail",method = RequestMethod.GET)
    String gamesList(@RequestParam Integer id, Model model);
}
