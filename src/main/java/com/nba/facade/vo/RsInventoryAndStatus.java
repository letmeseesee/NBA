package com.nba.facade.vo;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class RsInventoryAndStatus {
    private Integer inventoryId;

    private String goodsSn;

    private String goodsAttr;

    private Boolean status;

    private String userName;

    private Integer addTime;
}
