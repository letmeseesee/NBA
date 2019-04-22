package com.nba.facade.vo.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Api("创建帖子回复页面提交接口")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class CreatePostReq {
    @ApiModelProperty(value = "主题ID",example = "1",required = true)
    private Integer subjectId;

    @ApiModelProperty(value = "回复内容",example = "1",required = true)
    private String message;

    @ApiModelProperty(value = "引用回复ID",example = "1",required = false)
    private Integer quoteId;

    @ApiModelProperty(value = "引用回复内容",example = "1",required = false)
    private String quoteMsg;
}
