package com.nba.facade.vo.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 2018-4-13
 */
@SuppressWarnings("Duplicates")
@Data
@ApiModel("返回系统信息")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class LoginRsp {

    @ApiModelProperty(value = "登陆结果")
    private Boolean result;
}
