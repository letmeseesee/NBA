package com.nba.server;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * 实现curl的Demo
 * @author wangyinghao 2019-03-18
 */
@Service
public class curlServerImpl implements curlServer {
    private Logger logger = LoggerFactory.getLogger(curlServerImpl.class);

    @Override
    public void curlPost(String data) {
        String url = "www.baidu.com";
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //请求地址设置
        HttpPost httpPost = new HttpPost(url);

        //设置请求配置
        RequestConfig requestConfig = RequestConfig
                .custom()
                .setConnectTimeout(30)
                .setMaxRedirects(5)
                .setConnectionRequestTimeout(60)
                .build();
        httpPost.setConfig(requestConfig);

        //设置请求体
        String content = StringUtils.EMPTY;
        if(!StringUtils.isEmpty(data)){
            StringEntity body = new StringEntity(data,"utf-8");
            //httpPost.setEntity(body);
        }

        //设置请求头
        //httpPost.addHeader("Content-Type","application/json");

        //设置请求返回值
        CloseableHttpResponse response = null;

        //请求
        try {
            response = httpClient.execute(httpPost);
            HttpEntity httpEntity = response.getEntity();
            content = EntityUtils.toString(httpEntity, HTTP.UTF_8);
        }catch (IOException e){
            e.getStackTrace();
        }finally {
            try {
                response.close();
                httpPost.abort();
                httpClient.close();
            }catch (Exception e){
                e.getStackTrace();
            }
        }

        logger.info(content);

    }

    @Override
    public void curlGet(String data) {

    }
}
