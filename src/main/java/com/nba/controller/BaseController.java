package com.nba.controller;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

public class BaseController {
    @Autowired
    HttpServletRequest request;

}
