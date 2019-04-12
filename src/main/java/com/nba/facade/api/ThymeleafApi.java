package com.nba.facade.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 王英浩 2019-2-12
 */
@Api(value = "Thymeleaf 示例页面")
public interface ThymeleafApi {
    /**
     * 显示用户页面
     * @param model 页面
     * @param name 名称
     * @return html
     */
    @ApiOperation(value = "显示用户页面,带Get参数")
    @RequestMapping(value = "show", method = RequestMethod.GET)
    String show(Model model, @RequestParam String name);

    /**
     * 首页
     * @param model 页面
     * @return html
     */
    @ApiOperation(value = "首页")
    @RequestMapping(value = "index", method = RequestMethod.GET)
    String index(Model model, HttpServletRequest request, HttpServletResponse response);

    @ApiOperation(value = "bootstrap首页")
    @RequestMapping(value = "bootstrap/index", method = RequestMethod.GET)
    String bootstrap(Model model);
}
