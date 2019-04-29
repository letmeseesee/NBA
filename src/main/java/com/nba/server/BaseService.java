package com.nba.server;

import com.nba.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

@Service
public class BaseService {
    @Autowired
    HttpServletRequest request;

    @Autowired
    LoginService loginService;


    public void setUser( Model model){
        //根据id获取用户
        User user = loginService.getUser((int)request.getSession().getAttribute("userId"));
        model.addAttribute("username",request.getSession().getAttribute("username"));
        model.addAttribute("userid",request.getSession().getAttribute("userId"));
        model.addAttribute("email",user.getEmail());
        model.addAttribute("gold",user.getGolds());
        model.addAttribute("posts",user.getPosts());
        model.addAttribute("threads",user.getThreads());
    }
}
