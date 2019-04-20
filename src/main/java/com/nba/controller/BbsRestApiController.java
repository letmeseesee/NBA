package com.nba.controller;

import com.nba.facade.api.BbsRestApi;
import com.nba.facade.vo.request.CreateThreadReq;
import com.nba.facade.vo.response.ajaxRsp;
import com.nba.server.ThreadService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

public class BbsRestApiController implements BbsRestApi {
    @Autowired
    ThreadService threadService;

    @Autowired
    HttpServletRequest request;

    @Override
    public ajaxRsp doCreateThread(CreateThreadReq createThreadReq) {
        Integer id = threadService.create(createThreadReq,
                (int)request.getAttribute("userId"));

        ajaxRsp ajaxRsp = new ajaxRsp();
        if(id > 0){
            ajaxRsp.setCode(0);
            ajaxRsp.setResultId(id);
        }else {
            ajaxRsp.setCode(1);
        }
        return ajaxRsp;
    }
}
