package com.nba.server;

import com.nba.mapper.NewsDAO;
import com.nba.model.News;
import com.nba.model.NewsExample;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GamesAsynTaskService {
    private Logger logger = LoggerFactory.getLogger(GetGamesService.class);

    @Autowired
    NewsDAO newsDAO;

    @Async("GameAnsycExecutor")
    public void saveNews(News news){
        //判断该数据是否在数据库总存在
        NewsExample newsExample = new NewsExample();
        NewsExample.Criteria criteria = newsExample.createCriteria();
        criteria.andNewsIdEqualTo(news.getNewsId());
        Long newsCount = newsDAO.countByExample(newsExample);
        if(newsCount == 0){

        }
    }

}
