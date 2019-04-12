package com.nba.server;

/**
 * @author 2019-03-18 王英浩 curl类
 */
public interface curlServer {
    /**
     * 实现POST
     */
    public void curlPost(String data);

    /**
     * 实现GEt
     */
    public void curlGet(String data);
}
