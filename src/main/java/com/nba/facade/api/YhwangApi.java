/*
 *
 * Copyright (c) 2018
 *
 */
package com.nba.facade.api;
import com.nba.facade.vo.request.SystemInfoReq;
import com.nba.facade.vo.response.SystemInfoRsp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @author jinhuari
 * date: 2018/3/9
 * description: 包裹API
 */
@Api(value = "Spring-Boot-swagger", tags = "Wms-Package-API")
public interface YhwangApi {
    @ApiOperation(value = "获取系统信息", notes = "获取系统信息")
    @RequestMapping(value = "yhwang/systeminfo", method = RequestMethod.POST)
    SystemInfoRsp systeminfo(@RequestBody SystemInfoReq orderMsgIn);

    @ApiOperation(value = "测试Get参数",notes = "测试Get参数")
    @RequestMapping(value = "yhwang/testGet", method = RequestMethod.GET)
    String testGet(@RequestParam String name, @RequestParam Integer count);

    @ApiOperation(value = "测试文件上传",notes = "测试文件上传")
    @RequestMapping(value = "yhwang/testUpload", consumes = "multipart/*",headers = "content-type=multipart/form-data",method = RequestMethod.POST)
    String testUpload(@ApiParam(value = "上传的文件", required = true) MultipartFile multipartFile, HttpServletRequest request) throws Exception;
}
