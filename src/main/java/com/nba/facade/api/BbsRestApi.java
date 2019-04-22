package com.nba.facade.api;

import com.nba.facade.vo.request.CreatePostReq;
import com.nba.facade.vo.request.CreateThreadReq;
import com.nba.facade.vo.request.LoginReq;
import com.nba.facade.vo.response.ajaxRsp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(value = "BBS REST接口")
public interface BbsRestApi {
    /**
     * 创建帖子页面提交接口
     * @param createThreadReq
     * @return
     */
    @ApiOperation(value = "创建帖子页面提交接口")
    @RequestMapping(value = "/bbs/doCreate",method = RequestMethod.POST)
    ajaxRsp doCreateThread(@RequestBody CreateThreadReq createThreadReq);


    /**
     * 创建帖子回复接口
     * @param createPostReq
     * @return
     */
    @ApiOperation(value = "创建帖子回复接口")
    @RequestMapping(value = "/bbs/doCreatePost",method = RequestMethod.POST)
    ajaxRsp doCreatePost(CreatePostReq createPostReq);
}
