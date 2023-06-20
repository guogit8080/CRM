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
}
