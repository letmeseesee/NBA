package com.nba.server;

import com.nba.facade.vo.request.CreateThreadReq;
import com.nba.mapper.BbsThreadDAO;
import com.nba.model.BbsThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThreadService {
    @Autowired
    BbsThreadDAO bbsThreadDAO;

    /**
     * 创建帖子
     * @param createThreadReq
     * @param admin
     * @return
     */
    public Boolean create(CreateThreadReq createThreadReq,Integer userId){
        BbsThread bbsThread = new BbsThread();
        bbsThread.setUid(userId);
        bbsThread.setCreateDate(new Long(System.currentTimeMillis()).intValue());
        bbsThread.setLastDate(new Long(System.currentTimeMillis()).intValue());
        bbsThread.setSubject(createThreadReq.getSubject());
        bbsThread.setType(0);
        bbsThread.s
    }
}
