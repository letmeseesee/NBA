package com.nba.server;

import com.nba.facade.vo.request.CreatePostReq;
import com.nba.facade.vo.request.CreateThreadReq;
import com.nba.mapper.BbsPostDAO;
import com.nba.mapper.BbsThreadDAO;
import com.nba.model.BbsPost;
import com.nba.model.BbsPostExample;
import com.nba.model.BbsThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    @Transactional
    public Integer create(CreateThreadReq createThreadReq, Integer userId, String uName){
        //插入主表信息
        BbsThread bbsThread = new BbsThread();
        bbsThread.setUid(userId);
        bbsThread.setCreateDate(new Long(System.currentTimeMillis()).intValue());
        bbsThread.setLastDate(new Long(System.currentTimeMillis()).intValue());
        bbsThread.setSubject(createThreadReq.getSubject());
        bbsThread.setType(0);
        bbsThread.setViews(1);
        bbsThread.setPosts(1);
        bbsThread.setClosed(false);
        bbsThreadDAO.insertSelective(bbsThread);

        //插入明细
        BbsPost bbsPost = new BbsPost();
        bbsPost.setTid(bbsThread.getTid());
        bbsPost.setUid(userId);
        bbsPost.setIsfirst(1);
        bbsPost.setCreateDate(new Long(System.currentTimeMillis()).intValue());
        bbsPost.setMessage(createThreadReq.getContent());
        bbsPost.setMessageFmt("");
        bbsPost.setQuotepid(0);
        bbsPost.setUname(uName);
        bbsPostDAO.insert(bbsPost);

        return bbsThread.getTid();
    }

    public BbsThread getBbsThreadById(Integer id){
        return bbsThreadDAO.selectByPrimaryKey(id);
    }

    public BbsPost getFirstBbsPostBySubject(Integer id){
        BbsPostExample bbsPostExample = new BbsPostExample();
        BbsPostExample.Criteria criteria = bbsPostExample.createCriteria();
        criteria.andTidEqualTo(id);
        criteria.andIsfirstEqualTo(1);
        return bbsPostDAO.selectByExample(bbsPostExample).get(0);
    }

    public List<BbsPost> getBbsPostBySubject(Integer id){
        BbsPostExample bbsPostExample = new BbsPostExample();
        BbsPostExample.Criteria criteria = bbsPostExample.createCriteria();
        criteria.andTidEqualTo(id);
        criteria.andIsfirstEqualTo(0);
        return bbsPostDAO.selectByExample(bbsPostExample);
    }

    public Integer createPost(CreatePostReq createPostReq,Integer userId, String uName){
        //插入明细
        BbsPost bbsPost = new BbsPost();
        bbsPost.setTid(createPostReq.getSubjectId());
        bbsPost.setUid(userId);
        bbsPost.setIsfirst(0);
        bbsPost.setCreateDate(new Long(System.currentTimeMillis()).intValue());
        bbsPost.setMessage(createPostReq.getMessage());
        bbsPost.setMessageFmt(createPostReq.getQuoteMsg());
        bbsPost.setQuotepid(createPostReq.getQuoteId());
        bbsPost.setUname(uName);
        return bbsPostDAO.insert(bbsPost);
    }
}
