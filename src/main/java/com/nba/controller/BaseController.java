package com.nba.controller;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * @author jinhuari
 * date: 2018/4/23
 * description:
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
public class BaseController {
    @Autowired
    HttpServletRequest request;

}
