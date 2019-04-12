package com.nba.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;

public class CommonTools {

    private static Logger log = LoggerFactory.getLogger(CommonTools.class);

    /**
     * Find same obj in set t.
     *
     * @param <T> the type parameter
     * @param set the set
     * @param t   the t
     * @return the t
     */
    public static <T> T findSameObjInSet(Set<T> set, T t) {

        if (CollectionUtils.isEmpty(set)) {
            return null;
        }
        if (!set.contains(t)) {
            return null;
        }

        Iterator<T> iterator = set.iterator();
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (next != null && next.equals(t)) {
                return next;
            }
        }
        return null;
    }


    /**
     * Uuid.
     *
     * @return the string
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }


    /**
     * Gets ip address.
     *
     * @param request the request
     * @return the ip address
     */
    public static String getIpAddress(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    /**
     * getRandom
     *
     * @param min
     * @param max
     * @return
     */
    public static int getRandom(int min, int max) {
        Random random = new Random();
        int s = random.nextInt(max) % (max - min + 1) + min;
        return s;
    }

    public static Boolean judgeString(String string, Function<String,Boolean> function){
        return function.apply(string);
    }
}
