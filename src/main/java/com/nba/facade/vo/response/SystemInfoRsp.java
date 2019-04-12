/*
 * Copyright (c) 2018. SheIn
 * 南京领添信息技术有限公司
 * http://shein.com
 * All rights reserved.
 */
package com.nba.facade.vo.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@SuppressWarnings("Duplicates")
@Data
@ApiModel("返回系统信息")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class SystemInfoRsp {
    @ApiModelProperty(value = "系统名称")
    private String systen;
}
