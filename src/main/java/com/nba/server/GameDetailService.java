package com.nba.server;

import com.nba.mapper.GameDetailDAO;
import com.nba.model.GameDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameDetailService {
    @Autowired
    GameDetailDAO gameDetailDAO;

    GameDetail selectByPrimary(Integer id) {
        return gameDetailDAO.selectByPrimaryKey(id);
    }

    @Transactional
    void batchInsertDeatil(List<GameDetail> gameDetails) {
        for (GameDetail gameDetail : gameDetails) {
            gameDetailDAO.insert(gameDetail);
        }
    }
}
