/*
 *
 * Copyright (c) 2018
 *
 */
package com.nba.facade.api;

import com.nba.facade.vo.request.LoginReq;
import com.nba.facade.vo.request.RegisterReq;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author admin
 * date: 2019/4/13
 */
@Api(value = "Spring-Boot-swagger", tags = "Wms-Package-API")
public interface LoginApi {
    /**
     * 登陆页面
     * @param model 视图
     * @return
     */
    @ApiOperation(value = "登陆页面",notes = "测试Get参数")
    @RequestMapping(value = "/login/index", method = RequestMethod.GET)
    String login(Model model);

    /**
     * 登陆结果
     * @param model 视图
     * @param loginReq 请求体
     * @return String
     */
    @ApiOperation(value = "登陆操作")
    @RequestMapping(value = "/login/doLogin",method = RequestMethod.POST)
    String doLogin(Model model,@RequestBody LoginReq loginReq);


    /**
     * 登陆结果
     * @param model 视图
     * @param loginReq 请求体
     * @return String
     */
    @ApiOperation(value = "登陆操作")
    @RequestMapping(value = "/login/main",method = RequestMethod.GET)
    String index(Model model);


    /**
     * 登出
     * @return
     */
    @ApiOperation(value = "退出登陆")
    @RequestMapping(value = "/login/logout",method = RequestMethod.GET  )
    String logout();

    @ApiOperation(value = "注册页面")
    @RequestMapping(value = "/login/register",method = RequestMethod.GET)
    String register();

    @ApiOperation(value = "注册")
    @RequestMapping(value = "/login/doRegister",method = RequestMethod.GET)
    String doRegister(@RequestParam String username,@RequestParam String email,@RequestParam String password, Model model);
}
