package com.nba.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ScheduledTasksTest {
    @Autowired
    ScheduledTasks scheduledTasks;

    @Test
    public void scheduledGetNews() {
    }

    @Test
    public void scheduledGetPlayers() {
    }

    @Test
    public void scheduledGetTeams() {
    }

    @Test
    public void scheduledGetAllGames() {
    }

    @Test
    public void scheduledGetDayGames() {
        scheduledTasks.scheduledGetDayGames();
    }

    @Test
    public void scheduledGetGamesNotClose(){
        scheduledTasks.scheduledGetGamesNotClose();
    }

    /**
     * 全流程测试
     */
    @Test
    public void testAll(){
        //随机选择一个比赛，将比赛的状态置为未开始

        //选择一些账户关注这一场比赛

        //将选择的比赛置为进行中--》测试邮件发送功能

        //对比赛进行投注

        //将比赛置为结束--》测试结算功能

    }
}