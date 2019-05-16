package com.nba.controller;

import com.nba.facade.api.LoginApi;
import com.nba.facade.dto.BbsThreadDto;
import com.nba.facade.dto.LastGameDot;
import com.nba.facade.vo.request.LoginReq;
import com.nba.facade.vo.request.RegisterReq;
import com.nba.model.*;
import com.nba.server.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author admin 2019-4-13
 */
@Controller
public class LoginController implements LoginApi {
    @Autowired
    LoginService loginService;

    @Autowired
    NewsService newsService;

    @Autowired
    GameService gameService;

    @Autowired
    ThreadService threadService;

    @Autowired
    HttpServletRequest request;

    @Autowired
    BaseService baseService;

    @Autowired
    PlayerService playerService;

    @Autowired
    TeamService teamService;

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
            request.getSession().setAttribute("username",result.getUsername());
            request.getSession().setAttribute("userId",result.getUid());

            //
            model.addAttribute("username",result.getUsername());
            model.addAttribute("email",result.getEmail());
            model.addAttribute("gold",result.getGolds());
            model.addAttribute("posts",result.getPosts());
            model.addAttribute("threads",result.getThreads());

            //获取最新的比赛
            List<LastGameDot> gamesList = gameService.getLastGames();
            model.addAttribute("gamesList",gamesList);

            //获取最新的新闻
            List<News> newsList = newsService.getLasterNews();
            System.out.println(newsList);
            model.addAttribute("newsList",newsList);
            model.addAttribute("newsCount",newsList.size());

            //获取最新的帖子
            List<BbsThreadDto> bbsThreadDtoList = threadService.getLastBbsThreadList();
            model.addAttribute("bbsThreadDtoList",bbsThreadDtoList);

            return "main/index";
        }
        return "login/index";
    }

    @Override
    public String index(Model model) {
        //设置当前用户
        baseService.setUser(model);
        //获取最新的比赛
        List<LastGameDot> gamesList = gameService.getLastGames();
        //获取最新的新闻
        List<News> newsList = newsService.getLasterNews();
        //获取最新的帖子
        List<BbsThreadDto> bbsThreadDtoList = threadService.getLastBbsThreadList();
        model.addAttribute("gamesList",gamesList);
        model.addAttribute("newsList",newsList);
        model.addAttribute("newsCount",newsList.size());
        model.addAttribute("bbsThreadDtoList",bbsThreadDtoList);
        return "main/index";
    }

    @Override
    public String search(String keyword,Model model) {
        //设置当前用户
        baseService.setUser(model);
        //获取最新的比赛
        List<LastGameDot> gamesList = gameService.getLastGames(keyword);
        //获取最新的新闻
        List<News> newsList = newsService.getLasterNews(keyword);
        //获取最新的帖子
        List<BbsThreadDto> bbsThreadDtoList = threadService.getLastBbsThreadList(keyword);

        //球队
        List<Players> players = playerService.getPlayers(keyword);

        //球员
        List<Teams> teamsList = teamService.getTeam(keyword);

        model.addAttribute("teamsList",teamsList);
        model.addAttribute("players",players);
        model.addAttribute("gamesList",gamesList);
        model.addAttribute("bbsThreadDtoList",bbsThreadDtoList);
        model.addAttribute("newsList",newsList);
        model.addAttribute("newsCount",newsList.size());
        return "main/search";
    }

    @Override
    public String logout() {
        request.setAttribute("username","");
        request.setAttribute("userid",0);
        return "login/index";
    }

    @Override
    public String register() {
        return "login/register";
    }

    @Override
    public String doRegister(@RequestParam String username, @RequestParam String email, @RequestParam String password, Model model) {
        RegisterReq registerReq = new RegisterReq();
        registerReq.setEmail(email);
        registerReq.setPassword(password);
        registerReq.setUsername(username);
        if (loginService.checkExistUser(registerReq) > 0){
            model.addAttribute("msg","用户重复");
            return "login/error";
        }else {
            if(loginService.register(registerReq) > 0){
                return this.login(model);
            }else {
                model.addAttribute("msg","注册失败");
                return "login/error";
            }
        }
    }


}
