package com.nba.facade.vo.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author xukaijun
 * @date 2018-05-24 11:09:33
 * @description:
 */
@SuppressWarnings("Duplicates")
@Data
@ApiModel("查询系统信息")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class SystemInfoReq{
    @ApiModelProperty(value = "区", example = "3c", required = false)
    private String area;
}
