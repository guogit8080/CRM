package com.qfedu.springbootcrm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("specification")
public class Specification {
    @TableId(type = IdType.AUTO)
    private Integer specificationId;
    private String specificationName;
    private String specificationValue;
    private String specificationImg;
    private Double specificationCostPrice;//成本价
    private Double specificationSupplyPrice;//供货价
    private Double specificationSellingPrice;//建议售价
    private Integer specificationRepertory;//库存
}
