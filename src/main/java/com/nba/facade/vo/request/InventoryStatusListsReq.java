package com.nba.facade.vo.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * 库存操作列表 请求
 *
 * @author wangyinghao 2019-2-3
 */
@Data
@ApiModel(value = "库存操作列表")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class InventoryStatusListsReq {
    @ApiModelProperty(value = "当前页", required = true, example = "1")
    @NotNull(message = "页码必须")
    private Integer currentPage;

    @ApiModelProperty(value = "每页条数", required = true, example = "100")
    @NotNull(message = "容量必须")
    @Min(value = 0, message = "容量必须大于0")
    @Max(value = 100, message = "容量必须小于100")
    private Integer limit;

    private Integer offset;

    @ApiModelProperty("商品编码")
    private String goodsSn;

    @ApiModelProperty("尺码")
    private String goodsAttr;

    @ApiModelProperty("上架时间")
    private Date addTime;

    @ApiModelProperty("是否删除")
    private Boolean isDelete;

    @ApiModelProperty("商品重量")
    @Min(value = 0, message = "重量必须大于0")
    @Max(value = 100000, message = "重量必须小于100000")
    private Integer weight;

    @ApiModelProperty("库存ID")
    private Integer inventoryId;

    @ApiModelProperty("商品来源")
    @NotEmpty
    private List<Integer> siteIds;
}
