package com.nba.facade.vo.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

@Api("Ajax通用返回")
@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ajaxRsp {
    @ApiModelProperty(value = "操作结果")
    private Boolean result;


    @ApiModelProperty(value = "操作返回码")
    private Integer code;

    @ApiModelProperty(value = "返回信息")
    private String msg;

}
