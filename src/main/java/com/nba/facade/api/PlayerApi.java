package com.nba.facade.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Api(value = "球员页面", tags = "PlayerApi")
public interface PlayerApi {
    @ApiOperation(value = "球员列表页")
    @RequestMapping(value = "/player/list",method = RequestMethod.GET)
    String gamesList(Model model);

    @ApiOperation(value = "球员详细页")
    @RequestMapping(value = "/player/detail",method = RequestMethod.GET)
    String gamesDetail(@RequestParam Integer id, Model model);
}
