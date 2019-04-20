package com.nba.controller;

import com.nba.facade.api.BbsApi;
import org.springframework.stereotype.Controller;

@Controller
public class BbsApiImpl implements BbsApi {
    @Override
    public String create() {
        return "/bbs/create";
    }

    @Override
    public String detail() {
        return "/bbs/detail";
    }
}
