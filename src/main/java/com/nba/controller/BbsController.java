package com.nba.controller;

import com.nba.facade.api.BbsApi;
import com.nba.facade.dto.BbsThreadDto;
import com.nba.model.BbsPost;
import com.nba.model.BbsThread;
import com.nba.server.BaseService;
import com.nba.server.ThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class BbsController implements BbsApi {
    @Autowired
    HttpServletRequest request;

    @Autowired
    BaseService baseService;

    @Autowired
    ThreadService threadService;

    @Override
    public String create() {
        return "/bbs/create";
    }

    @Override
    public String detail(@RequestParam Integer subjectId, Model model) {
        //设置当前用户
        baseService.setUser(model);
        //获取主题
        BbsThread bbsThread = threadService.getBbsThreadById(subjectId);

        //获取首回复
        BbsPost bbsPost = threadService.getFirstBbsPostBySubject(subjectId);

        //获取回复
        List<BbsPost> bbsPostList = threadService.getBbsPostBySubject(subjectId);

        model.addAttribute("bbsThread",bbsThread);
        model.addAttribute("bbsPost",bbsPost);
        model.addAttribute("bbsPostList",bbsPostList);
        model.addAttribute("bbsPostListCount",bbsPostList.size());
        return "/bbs/detail";
    }

    @Override
    public String mainPage(Long start, Integer limit, Model model) {
        //设置当前用户
        baseService.setUser(model);

        //获取帖子
        List<BbsThreadDto> bbsThreadList = threadService.getBbsThreadList(start,limit);
        model.addAttribute("bbsThreadList",bbsThreadList);
        return "/bbs/mainPage";
    }

}
