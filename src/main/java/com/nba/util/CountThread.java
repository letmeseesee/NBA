package com.nba.util;

import org.springframework.stereotype.Service;

@Service
public class CountThread {

    // 含有synchronized同步块的方法
    public void synMethod() {
        synchronized(this) {
            try {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(100); // 休眠100ms
                    System.out.println(Thread.currentThread().getName() + " synMethod loop " + i);
                }
            } catch (InterruptedException ie) {
            }
        }
    }

    // 非同步的方法
    public void nonSynMethod() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + " nonSynMethod loop " + i);
            }
        } catch (InterruptedException ie) {
        }
    }
}
