package com.qfedu.springbootcrm.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("store_shop")
public class StoreShop {
    private Integer storeId;
    private Integer shopId;
}
