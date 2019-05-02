package com.nba.facade.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api(value = "竞猜")
public interface CompetitionApi {
    @ApiOperation(value = "下注")
    @RequestMapping(value = "/competition/bet",method = RequestMethod.POST)
}
