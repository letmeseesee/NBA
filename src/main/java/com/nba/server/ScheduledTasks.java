package com.nba.server;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@Slf4j
public class ScheduledTasks {
    private static final SimpleDateFormat simpleDateTimeFormat = new SimpleDateFormat("HH:mm:ss");

    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);


    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        logger.info("现在时间：" + simpleDateTimeFormat.format(new Date()));
    }
}
