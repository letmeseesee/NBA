package com.nba.server;

import com.nba.mapper.GameDetailDAO;
import com.nba.model.GameDetail;
import com.nba.model.GameDetailExample;
import io.swagger.models.auth.In;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameDetailService {
    private Logger logger = LoggerFactory.getLogger(GameDetailService.class);

    @Autowired
    GameDetailDAO gameDetailDAO;

    @Autowired
    QuarterService quarterService;

    GameDetail selectByPrimary(Integer id) {
        return gameDetailDAO.selectByPrimaryKey(id);
    }

    @Transactional
    public void batchInsertDetail(List<GameDetail> gameDetails) {
        for (GameDetail gameDetail : gameDetails) {
            gameDetailDAO.insert(gameDetail);
            logger.info("插入比赛详情的信息",gameDetail.getPlayId());
        }
    }

    public List<GameDetail> getGameDetailListByGame(Integer game_id){
        List<Integer> quterIds = quarterService.getAllQuters(game_id);
        if(!quterIds.isEmpty()) {
            GameDetailExample gameDetailExample = new GameDetailExample();
            GameDetailExample.Criteria criteria = gameDetailExample.createCriteria();
            gameDetailExample.setOrderByClause("play_id desc");
            gameDetailExample.setLimit(50);
            criteria.andQuarterIdIn(quterIds);
            return gameDetailDAO.selectByExample(gameDetailExample);
        }
        List<GameDetail> emptyList = new ArrayList<>();
        return emptyList;
    }
}
