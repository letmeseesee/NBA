package com.nba.facade.vo.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@ApiModel("库存列表请求参数")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class InventoryListReq {
    @ApiModelProperty(value = "当前页",required = true)
    @NotBlank(message = "页码必须")
    private Integer currentPage;

    @ApiModelProperty(value = "每页条数",required = true)
    @NotBlank(message = "容量必须")
    private Integer pageSize;

    @ApiModelProperty("商品编码")
    private String goodsSn;

    @ApiModelProperty("尺码")
    private String goodsAttr;

    @ApiModelProperty("库存区域")
    private Integer inventoryType;

    @ApiModelProperty("库存状态")
    private Integer inventoryStatus;

    @ApiModelProperty("上架时间")
    private Date addTime;

}
