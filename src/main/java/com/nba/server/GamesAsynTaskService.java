package com.nba.server;

import com.nba.mapper.NewsDAO;
import com.nba.mapper.PlayersDAO;
import com.nba.model.News;
import com.nba.model.NewsExample;
import com.nba.model.Players;
import com.nba.model.PlayersExample;
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

    @Autowired
    PlayersDAO playersDAO;

    @Async("GameAnsycExecutor")
    public void saveNews(News news){
        //判断该数据是否在数据库总存在
        NewsExample newsExample = new NewsExample();
        NewsExample.Criteria criteria = newsExample.createCriteria();
        criteria.andNewsIdEqualTo(news.getNewsId());
        Long newsCount = newsDAO.countByExample(newsExample);
        if(newsCount == 0){
            try {
                newsDAO.insert(news);
                logger.info(news.toString());
            }catch (Exception e){
                logger.warn("插入数据失败！");
            }
        }
    }

    @Async("GameAnsycExecutor")
    public void savePlayer(Players players){
        //查询当前是否存在该运动员
        PlayersExample playersExample = new PlayersExample();
        PlayersExample.Criteria criteria = playersExample.createCriteria();
        criteria.andPlayerIdEqualTo(players.getPlayerId());
        if(playersDAO.countByExample(playersExample) > 0){
          //判断是否要更新
            Players OldPlayer = playersDAO.selectByExample(playersExample).get(0);
            if(!OldPlayer.equals(players)){
                playersDAO.updateByExample(players,playersExample);
                logger.info("更新球员{}的信息",players.getFirstName());
            } else {
               logger.info("球员{}的信息一致不更新",players.getFirstName());
            }
        } else {
            playersDAO.insert(players);
            logger.info("插入球员{}的信息",players.getFirstName());
        }
    }

}
