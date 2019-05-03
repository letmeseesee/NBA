package com.nba.server;

import com.nba.mapper.NewsDAO;
import com.nba.model.News;
import com.nba.model.NewsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    NewsDAO newsDAO;

    public List<News> getLasterNews(){
        List<News> newsList;
        NewsExample newsExample = new NewsExample();
        NewsExample.Criteria criteria = newsExample.createCriteria();
        newsExample.setOrderByClause("news_id DESC");
        newsExample.setLimit(10);
        newsExample.setOffset((long)0);

        //查询数据
        newsList = newsDAO.selectByExample(newsExample);
        return newsList;
    }

    public List<News> getLasterNews(String keyword){
        List<News> newsList;
        NewsExample newsExample = new NewsExample();
        NewsExample.Criteria criteria = newsExample.createCriteria();
        criteria.andTitleLike("%" + keyword +"%");
        newsExample.or(criteria);
        NewsExample.Criteria criteria1 = newsExample.createCriteria();
        criteria1.andContentLike("%" + keyword +"%");
        newsExample.or(criteria1);
        newsExample.setOrderByClause("news_id DESC");
        newsExample.setLimit(10);
        newsExample.setOffset((long)0);

        //查询数据
        newsList = newsDAO.selectByExample(newsExample);
        return newsList;
    }
}
