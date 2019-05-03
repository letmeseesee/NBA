package com.nba.facade.vo.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Api("注册")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class RegisterReq {
    @ApiModelProperty(value = "用户名", example = "admin", required = true)
    private String username;

    @ApiModelProperty(value = "密码", example = "123456", required = true)
    private String password;

    @ApiModelProperty(value = "邮件", example = "xxxx@xx.com", required = true)
    private String email;
}
