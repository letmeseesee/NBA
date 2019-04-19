package com.nba.facade;

import com.nba.facade.vo.request.CreateThreadReq;
import com.nba.facade.vo.request.LoginReq;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(value = "BBS REST接口")
public interface BbsRestApi {
    @ApiOperation(value = "创建帖子页面提交接口")
    @RequestMapping(value = "/bbs/doCreate",method = RequestMethod.POST)
    String doCreateThread(@RequestBody CreateThreadReq createThreadReq);
}
