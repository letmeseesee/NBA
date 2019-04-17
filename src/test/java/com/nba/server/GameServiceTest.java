package com.nba.server;

import com.nba.facade.dto.LastGameDot;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
public class GameServiceTest {
    @Autowired
    GameService gameService;

    @Test
    public void getLastGames() {
        List<LastGameDot> gameDots = gameService.getLastGames();
        log.info(gameDots.toString());
    }
}