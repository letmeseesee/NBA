package com.nba.server;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
public class GetGamesServiceTest {
    @Autowired
    GetGamesService getGamesService;


    @Test
    public void test(){
        getGamesService.getGameByTime("2017-01");
    }

    @Test
    public void test01(){
        getGamesService.getNewsByDate("2019-01");
    }

    @Test
    public void test02(){
        getGamesService.getAllTeams();
    }


    @Test
    public void test03(){
        getGamesService.getPlayers();
    }

    @Test
    public void test04(){
        getGamesService.getGamesByDate("2019");
    }
}