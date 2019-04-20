package com.nba.facade.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api(value = "Spring-Boot-swagger", tags = "Wms-Package-API")
public interface BbsApi {
    @ApiOperation(value = "创建帖子页面")
    @RequestMapping(value = "/bbs/create",method = RequestMethod.GET)
    String create();

    @ApiOperation(value = "帖子详情")
    @RequestMapping(value = "/bbs/detail",method = RequestMethod.GET)
    public String detail();
}
