package com.nba.facade.vo.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Api("竞猜")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class BetReq {
    @ApiModelProperty(value = "押注的球队",example = "1",required = true)
    private Integer teamId;

    @ApiModelProperty(value = "押注的比赛",example = "1",required = true)
    private Integer gameId;
}
