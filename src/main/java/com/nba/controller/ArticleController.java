package com.nba.controller;

import com.nba.facade.api.ArticleApi;
import com.nba.model.News;
import com.nba.server.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class ArticleController implements ArticleApi {
    @Autowired
    ArticleService articleService;

    @Override
    public String articleList(Model model) {
        List<News> newsList = articleService.getNews();
        model.addAttribute("newsList",newsList);
        return "/news/newslist";
    }

    @Override
    public String articlePage(int nid, Model model) {
        News news = articleService.getNews(nid);
        model.addAttribute("news",news);
        return "/news/detail";
    }
}
