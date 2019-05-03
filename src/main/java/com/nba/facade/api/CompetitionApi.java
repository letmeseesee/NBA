package com.nba.facade.api;

import com.nba.facade.vo.request.BetReq;
import com.nba.facade.vo.response.ajaxRsp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api(value = "竞猜")
public interface CompetitionApi {
    @ApiOperation(value = "下注")
    @RequestMapping(value = "/competition/bet",method = RequestMethod.POST)
    ajaxRsp bet(@RequestBody BetReq betReq);
}
