package com.nba.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

@Service
public class BaseService {
    @Autowired
    HttpServletRequest request;


    public void setUser( Model model){
        model.addAttribute("username",request.getAttribute("username"));
        model.addAttribute("userid",request.getAttribute("userId"));
    }
}
