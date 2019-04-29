package com.nba.facade.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Api(value = "帖子页面", tags = "BBSAPI")
public interface BbsApi {
    @ApiOperation(value = "创建帖子页面")
    @RequestMapping(value = "/bbs/create",method = RequestMethod.GET)
    String create();

    @ApiOperation(value = "帖子详情")
    @RequestMapping(value = "/bbs/detail",method = RequestMethod.GET)
    String detail(@RequestParam Integer subjectId,Model model);

    @ApiOperation(value = "帖子列表")
    @RequestMapping(value = "/bbs/main",method = RequestMethod.GET)
    String mainPage(@RequestParam Long start,@RequestParam Integer limit,Model model);
}
