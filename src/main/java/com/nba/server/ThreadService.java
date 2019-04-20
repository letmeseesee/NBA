package com.nba.server;

import com.nba.facade.vo.request.CreateThreadReq;
import com.nba.mapper.BbsPostDAO;
import com.nba.mapper.BbsThreadDAO;
import com.nba.model.BbsPost;
import com.nba.model.BbsThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ThreadService {
    @Autowired
    BbsThreadDAO bbsThreadDAO;

    @Autowired
    BbsPostDAO bbsPostDAO;

    /**
     * 创建帖子
     * @param createThreadReq 帖子信息
     * @param userId 当前用户
     * @return boolean
     */
    @Transactional(rollbackFor = Exception.class)
    public Integer create(CreateThreadReq createThreadReq,Integer userId){
        //插入主表信息
        BbsThread bbsThread = new BbsThread();
        bbsThread.setUid(userId);
        bbsThread.setCreateDate(new Long(System.currentTimeMillis()).intValue());
        bbsThread.setLastDate(new Long(System.currentTimeMillis()).intValue());
        bbsThread.setSubject(createThreadReq.getSubject());
        bbsThread.setType(0);
        Integer tid = bbsThreadDAO.insert(bbsThread);

        //插入明细
        BbsPost bbsPost = new BbsPost();
        bbsPost.setPid(tid);
        bbsPost.setUid(userId);
        bbsPost.setIsfirst(1);
        bbsPost.setCreateDate(new Long(System.currentTimeMillis()).intValue());
        bbsPost.setMessage(createThreadReq.getContent());
        Integer pid = bbsPostDAO.insert(bbsPost);

        return tid;
    }
}
