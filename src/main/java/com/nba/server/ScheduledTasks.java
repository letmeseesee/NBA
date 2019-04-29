package com.nba.server;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Service
@Slf4j
public class ScheduledTasks {
    private SimpleDateFormat simpleDateTimeFormat = new SimpleDateFormat("HH:mm:ss");
    private SimpleDateFormat simpleDateDay = new SimpleDateFormat("yyyy-MM-dd");
    private SimpleDateFormat simpleDateYear = new SimpleDateFormat("yyyy");
    private SimpleDateFormat simpleDateMonth = new SimpleDateFormat("yyyy-MM");

    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);

    @Autowired
    GetGamesService getGamesService;

    /**
     * 定时抓取新闻 半小时一次
     *  @Scheduled(cron = "0 0/57 * * * ?")
     */
//    @Scheduled(fixedRate = 1000 * 60 * 30)
    public void scheduledGetNews() {
        logger.info("现在时间：" + simpleDateTimeFormat.format(new Date())+ "抓取新闻。");
        //抓取当天的新闻 （模拟数据取得三天前的新闻）
        Calendar calendar = Calendar.getInstance();
        //得到前三天
        calendar.add(Calendar.DATE, -10);
        Date date = calendar.getTime();
        System.out.println(simpleDateDay.format(date));
        getGamesService.getNewsByDate(simpleDateDay.format(date));
    }


    /**
     * 定时抓取球员,每天中午抓取
     *  @Scheduled(cron = "0 0/57 * * * ?")
     */
//    @Scheduled(cron = "0 0 0/12 * * ?")
    public void scheduledGetPlayers() {
        logger.info("现在时间：" + simpleDateTimeFormat.format(new Date())+ "抓取球员。");
        getGamesService.getPlayers();
    }

    /**
     * 定时抓取球队,每天中午抓取
     *  @Scheduled(cron = "0 0/57 * * * ?")
     *      @Scheduled(fixedRate = 1000 * 60)
     */
//    @Scheduled(cron = "0 0 0/12 * * ?")
    public void scheduledGetTeams() {
        logger.info("现在时间：" + simpleDateTimeFormat.format(new Date())+ "抓取球队。");
        getGamesService.getAllTeams();
    }

    /**
     * 抓取今年的比赛 一月抓取
     */
//    @Scheduled(cron = "0 0 0 0/1 * ?")
    public void scheduledGetAllGames() {
        logger.info("现在时间：" + simpleDateTimeFormat.format(new Date())+ "抓取全年比赛。");
        Calendar calendar = Calendar.getInstance();
        //得到前三天
        calendar.add(Calendar.DATE,0);
        Date date = calendar.getTime();
        System.out.println(simpleDateDay.format(date));
        getGamesService.getGamesByDate(simpleDateYear.format(date));
    }

    /**
     * 抓取一个月内的比赛 五分钟抓取一次
     */
//    @Scheduled(fixedRate = 1000 * 60 * 5)
    public void scheduledGetDayGames() {
        Calendar calendar = Calendar.getInstance();
        logger.info("现在时间：" + simpleDateTimeFormat.format(new Date())+ "抓取当月的比赛。");
        calendar.add(Calendar.MONTH,-1);
        Date date = calendar.getTime();
        System.out.println(simpleDateMonth.format(date));
        getGamesService.getGamesByDate(simpleDateYear.format(date));

        logger.info("现在时间：" + simpleDateTimeFormat.format(new Date())+ "抓取下个月的比赛。");
        calendar.add(Calendar.DATE,0);
        date = calendar.getTime();
        System.out.println(simpleDateDay.format(date));
        getGamesService.getGamesByDate(simpleDateYear.format(date));
    }
}
