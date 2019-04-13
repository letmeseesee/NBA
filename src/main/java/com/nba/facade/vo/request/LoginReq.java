package com.nba.facade.vo.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 2018-4-13
 */
@Api("登陆")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class LoginReq {
    @ApiModelProperty(value = "用户名", example = "admin", required = true)
    private String username;

    @ApiModelProperty(value = "密码", example = "123456", required = true)
    private String password;

}
