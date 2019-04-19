package com.nba.facade.vo.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Api("创建帖子页面提交接口")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class CreateThreadReq {
    @ApiModelProperty(value = "主题", example = "admin", required = true)
    private String subject;

    @ApiModelProperty(value = "关联", example = "admin", required = true)
    private String related;

    @ApiModelProperty(value = "内容", example = "admin", required = false)
    private String content;

}
