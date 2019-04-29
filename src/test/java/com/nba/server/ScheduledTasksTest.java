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
}