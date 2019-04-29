package com.nba.server;

import com.nba.mapper.NewsDAO;
import com.nba.model.News;
import com.nba.model.NewsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    NewsDAO newsDAO;

    public News getNews(Integer nid){
        return newsDAO.selectByPrimaryKey(nid);
    }

    public List<News> getNews(){
        //取得最新
        NewsExample newsExample = new NewsExample();
        NewsExample.Criteria criteria = newsExample.createCriteria();
        newsExample.setOrderByClause("news_id DESC");
        newsExample.setLimit(100);
        return newsDAO.selectByExample(newsExample);
    }
}
