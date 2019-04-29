package com.nba.facade.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author admin 2019
 */
@Api(value = "新闻页面", tags = "ARTICELAPI")
public interface ArticleApi {
    /**
     * 新闻列表
     * @param model
     * @return
     */
    @ApiOperation(value = "新闻列表")
    @RequestMapping(value = "/news/list",method = RequestMethod.GET)
    String articleList(Model model);

    /**
     * 新闻详情
     * @param nid
     * @param limit
     * @param model
     * @return
     */
    @ApiOperation(value = "新闻详情")
    @RequestMapping(value = "/news/detail",method = RequestMethod.GET)
    String articlePage(@RequestParam int nid, Model model);
}
