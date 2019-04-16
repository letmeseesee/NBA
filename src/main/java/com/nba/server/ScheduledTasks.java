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

    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);

    @Autowired
    GetGamesService getGamesService;

    /**
     * 定时抓取新闻 半小时一次
     *  @Scheduled(cron = "0 0/57 * * * ?")
     */
    @Scheduled(fixedRate = 1000 * 60 * 30)
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
    @Scheduled(cron = "0 0 0/12 * * ?")
    public void scheduledGetPlayers() {
        logger.info("现在时间：" + simpleDateTimeFormat.format(new Date())+ "抓取球员。");
        getGamesService.getPlayers();
    }
}
