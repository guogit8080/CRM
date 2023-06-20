package com.qfedu.springbootcrm.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@TableName("shop")
public class Shop {
    private Integer shopId;
    private String shopArticleNum;//商品货号
    private String shopName;
    private String shopImg;
    private String shopDetial;//商品详情
}
