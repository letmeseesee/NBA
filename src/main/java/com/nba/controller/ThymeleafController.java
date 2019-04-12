package com.nba.controller;

/*
 * 测试thymeleaf
 */

import com.nba.facade.api.ThymeleafApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@Slf4j
public class ThymeleafController extends BaseController  implements ThymeleafApi {
    private Integer count = 0;

    @Override
    public String show(Model model,@RequestParam String name){
        model.addAttribute("uid","123456789");
        model.addAttribute("name",name);
        return "show";
    }

    @Override
    public String index(Model model, HttpServletRequest request, HttpServletResponse response){
        log.info("{}",request.getHeader("User-Agent"));

        count++;
        HttpSession httpSession = request.getSession();
        String sessionId = httpSession.getId();

        httpSession.setAttribute("username","TOM");
        httpSession.setAttribute("password","tommmm");

        httpSession.getAttribute("username");
        httpSession.getAttribute("password");

        Cookie cookie = new Cookie("yhwang","12332121");
        cookie.setPath("/");
        response.addCookie(cookie);

        model.addAttribute("sessionId",sessionId);
        model.addAttribute("uid","123456789");
        log.info("调用次数{}",count);
        return "index";
    }

    @Override
    public String bootstrap(Model model) {
        return "bootstrap/index";
    }
}