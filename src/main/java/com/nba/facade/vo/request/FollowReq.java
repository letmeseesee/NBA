package com.nba.facade.vo.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Api("关注比赛")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class FollowReq {
    @ApiModelProperty(value = "关注的比赛",example = "1",required = true)
    private Integer gameId;
}
