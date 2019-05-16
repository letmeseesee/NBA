package com.nba.facade.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Api(value = "球队页面", tags = "TeamApi")
public interface TeamApi {
    @ApiOperation(value = "球队列表页")
    @RequestMapping(value = "/team/list",method = RequestMethod.GET)
    String gamesList(Model model);

    @ApiOperation(value = "球队详细页")
    @RequestMapping(value = "/team/detail",method = RequestMethod.GET)
    String gamesDetail(@RequestParam Integer id, Model model);
}
