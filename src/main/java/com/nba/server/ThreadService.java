package com.nba.server;

import com.nba.facade.dto.BbsThreadDto;
import com.nba.facade.vo.request.CreatePostReq;
import com.nba.facade.vo.request.CreateThreadReq;
import com.nba.mapper.BbsPostDAO;
import com.nba.mapper.BbsThreadDAO;
import com.nba.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Service
public class ThreadService {
    @Autowired
    BbsThreadDAO bbsThreadDAO;

    @Autowired
    BbsPostDAO bbsPostDAO;

    @Autowired
    HttpServletRequest request;

    @Autowired
    LoginService loginService;

    /**
     * 创建帖子
     *
     * @param createThreadReq 帖子信息
     * @param userId          当前用户
     * @return boolean
     */
    @Transactional
    public Integer create(CreateThreadReq createThreadReq, Integer userId, String uName) {
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
        loginService.addUserThread();
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

    @Transactional
    public Integer createGameThread(Games games) {
        //获取管理员信息
        User adminUser = loginService.getAdminUser();
        Integer userId ;
        String  uName;
        if(adminUser != null){
            userId = adminUser.getUid();
            uName = adminUser.getUsername();
        }else {
            userId = 0;
            uName = "root";
        }
        //插入主表信息
        BbsThread bbsThread = new BbsThread();
        bbsThread.setUid(userId);
        bbsThread.setCreateDate(new Long(System.currentTimeMillis()).intValue());
        bbsThread.setLastDate(new Long(System.currentTimeMillis()).intValue());
        bbsThread.setSubject(games.getHomeTeam() + " VS " +games.getHomeTeam());
        bbsThread.setType(1);
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
        bbsPost.setMessage(games.getHomeTeam() + " VS " +games.getHomeTeam());
        bbsPost.setMessageFmt("");
        bbsPost.setQuotepid(0);
        bbsPost.setUname(uName);
        bbsPostDAO.insert(bbsPost);
        return bbsThread.getTid();
    }

    public List<BbsThreadDto> getBbsThreadList(Long page, Integer limit){
        BbsThreadExample bbsThreadExample = new BbsThreadExample();
        BbsThreadExample.Criteria criteria = bbsThreadExample.createCriteria();
        bbsThreadExample.setOrderByClause("tid DESC");
        bbsThreadExample.setOffset((page-1)*limit);
        bbsThreadExample.setLimit(limit);
        return bbsThreadDAO.selectByExampleAndCreater(bbsThreadExample);
    }

    public List<BbsThreadDto> getLastBbsThreadList(){
        List<BbsThreadDto> bbsThreadDtoList = new ArrayList<>();
        //获取今天新增的帖子
        BbsThreadExample bbsThreadExample = new BbsThreadExample();
        bbsThreadExample.setLimit(10);
        bbsThreadExample.setOrderByClause("tid desc");
        bbsThreadDtoList = bbsThreadDAO.selectByExampleAndCreater(bbsThreadExample);
        return bbsThreadDtoList;
    }

    public List<BbsThreadDto> getLastBbsThreadList(String keyword){
        List<BbsThreadDto> bbsThreadDtoList = new ArrayList<>();
        //获取今天新增的帖子
        BbsThreadExample bbsThreadExample = new BbsThreadExample();
        BbsThreadExample.Criteria criteria = bbsThreadExample.createCriteria();
        criteria.andSubjectLike("%" + keyword +"%");
        bbsThreadExample.setLimit(10);
        bbsThreadExample.setOrderByClause("tid desc");
        bbsThreadDtoList = bbsThreadDAO.selectByExampleAndCreater(bbsThreadExample);
        return bbsThreadDtoList;
    }

    public BbsThread getBbsThreadById(Integer id) {
        return bbsThreadDAO.selectByPrimaryKey(id);
    }

    public BbsPost getFirstBbsPostBySubject(Integer id) {
        BbsPostExample bbsPostExample = new BbsPostExample();
        BbsPostExample.Criteria criteria = bbsPostExample.createCriteria();
        criteria.andTidEqualTo(id);
        criteria.andIsfirstEqualTo(1);
        return bbsPostDAO.selectByExample(bbsPostExample).get(0);
    }

    public List<BbsPost> getBbsPostBySubject(Integer id) {
        BbsPostExample bbsPostExample = new BbsPostExample();
        BbsPostExample.Criteria criteria = bbsPostExample.createCriteria();
        criteria.andTidEqualTo(id);
        criteria.andIsfirstEqualTo(0);
        return bbsPostDAO.selectByExample(bbsPostExample);
    }

    public Integer createPost(CreatePostReq createPostReq, Integer userId, String uName) {
        //插入明细
        BbsPost bbsPost = new BbsPost();
        bbsPost.setTid(createPostReq.getSubjectId());
        bbsPost.setUid(userId);
        bbsPost.setIsfirst(0);
        bbsPost.setCreateDate(new Long(System.currentTimeMillis()).intValue());
        bbsPost.setMessage(createPostReq.getMessage());
        if(createPostReq.getQuoteId() == 0) {
            bbsPost.setMessageFmt(" ");
        }else {
            String QuoteHtml = formatQuoteHtml(createPostReq.getQuoteId());
            bbsPost.setMessageFmt(QuoteHtml);
        }
        bbsPost.setQuotepid(createPostReq.getQuoteId());
        bbsPost.setUname(uName);
        bbsPostDAO.insert(bbsPost);

        //添加回复数
        loginService.addUserPost();
        return bbsPost.getPid();
    }

    public String formatPostLiHtml(Integer tid, Integer pid) {
        BbsPostExample bbsPostExample = new BbsPostExample();
        BbsPostExample.Criteria criteria = bbsPostExample.createCriteria();
        criteria.andPidEqualTo(pid);
        BbsPost bbsPost = bbsPostDAO.selectByExample(bbsPostExample).get(0);
        //获取回复数
        BbsPostExample bbsPostExample1 = new BbsPostExample();
        BbsPostExample.Criteria criteria1 = bbsPostExample1.createCriteria();
        criteria1.andTidEqualTo(tid);
        Long count = bbsPostDAO.countByExample(bbsPostExample1);

        String html = "<li class=\"media post\" data-pid=\"" + pid + "\" " +
                "data-uid=\"" + (int) request.getSession().getAttribute("userId") + "\" >\n" +
                "                                            <a href=\"#\" class=\"mr-3\" tabindex=\"-1\">\n" +
                "                                                <img class=\"avatar-3 mr-3 small\" style=\"width: 30px;height: 30px\" src=\"/vendor/timg.jpeg\" >\n" +
                "                                            </a>\n" +
                "                                            <div class=\"media-body\">\n" +
                "                                                <div class=\"d-flex justify-content-between small text-muted\">\n" +
                "                                                    <!--回复人-->\n" +
                "                                                    <div>\n" +
                "\t\t\t\t\t\t\t\t\t                    <span class=\"username\">\n" +
                "\t\t\t\t\t\t\t\t\t\t                    <a href=\"?user-1.htm\" class=\"text-muted font-weight-bold\">" +
                (String) request.getSession().getAttribute("username")
                + "</a>\n" +
                "\t\t\t\t\t\t\t\t\t                    </span>\n" +
                "                                                    </div>\n" +
                "                                                    <!--操作和楼层-->\n" +
                "                                                    <div class=\"text-right text-grey\">\n" +
                "                                                        <a href=\"javascript:void(0)\" data-tid=\"" + tid + "\" data-pid=\"" + pid + "\" class=\"text-grey post_reply mr-3\">\n" +
                "                                                            <i class=\"fa fa-mail-reply\" title=\"Reply\"></i> " +
                "<span class=\"d-none\">Reply</span>\n" +
                "                                                        </a>\n" +
                "                                                        <span class=\"floor-parent\">\n" +
                "\t\t\t\t\t\t\t\t\t\t                    <span class=\"floor mr-0\">" + (count - 1) + "</span>Floor\n" +
                "                                                        </span>\n" +
                "                                                    </div>\n" +
                "                                                </div>\n" +
                "                                                <div class=\"message mt-1 break-all\">\n" +
                bbsPost.getMessageFmt() + bbsPost.getMessage() +
                "                                                </div>\n" +
                "                                            </div>\n" +
                "                                        </li>";
        return html;
    }

    public String formatQuoteHtml(Integer quotePid){
        BbsPostExample bbsPostExample = new BbsPostExample();
        BbsPostExample.Criteria criteria = bbsPostExample.createCriteria();
        criteria.andPidEqualTo(quotePid);
        BbsPost bbsPost = bbsPostDAO.selectByExample(bbsPostExample).get(0);
        String html = " <blockquote class=\"blockquote\">\n" +
                "                                                        <a href=\"#\" class=\"text-small text-muted user\">\n" +
                (String) request.getSession().getAttribute("username") +
                "                                                        </a>\n" +
                bbsPost.getMessage() +
                "                                                    </blockquote>";
        return html;
    }
}
