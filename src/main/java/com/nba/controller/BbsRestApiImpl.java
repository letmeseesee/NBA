package com.nba.controller;

import com.nba.facade.api.BbsRestApi;
import com.nba.facade.vo.request.CreateThreadReq;
import com.nba.facade.vo.response.ajaxRsp;
import com.nba.server.ThreadService;
import org.springframework.beans.factory.annotation.Autowired;

public class BbsRestApiImpl implements BbsRestApi {
    @Autowired
    ThreadService threadService;

    @Override
    public ajaxRsp doCreateThread(CreateThreadReq createThreadReq) {

        return null;
    }
}
