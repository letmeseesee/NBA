package com.nba.controller;

import com.nba.facade.api.LoginApi;
import com.nba.facade.vo.request.LoginReq;
import com.nba.model.User;
import com.nba.server.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author admin 2019-4-13
 */
@Controller
public class LoginController implements LoginApi {
    @Autowired
    LoginService loginService;

    @Autowired
    HttpServletRequest request;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @Override
    public String login(Model model) {
        return "login/index";
    }


    @Override
    public String doLogin(Model model, LoginReq loginReq) {
        User result = loginService.doLogin(loginReq.getUsername(),loginReq.getPassword());
        if(result != null){
            request.setAttribute("username",loginReq.getUsername());
            model.addAttribute("name",loginReq.getUsername());
            model.addAttribute("email",result.getEmail());
            model.addAttribute("gold",result.getGolds());
            model.addAttribute("posts",result.getPosts());
            model.addAttribute("threads",result.getThreads());
            return "main/index";
        }
        return "login/index";
    }

    @Override
    public String logout() {
        request.setAttribute("username","");
        return "login/index";
    }
}
