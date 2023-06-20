package com.qfedu.springbootcrm.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("shop_specification")
public class ShopSpacification {
    private Integer shopId;
    private Integer specificationId;
    private Double specificationCostPrice;//成本价
    private Double specificationSupplyPrice;//供货价
    private Double specificationSellingPrice;//建议售价
    private Integer specificationRepertory;//库存
}
