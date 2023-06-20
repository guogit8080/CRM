package com.qfedu.springbootcrm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("store")
public class Store {
    @TableId(type = IdType.AUTO)
    private Integer storeId;
    private String storeLogo;
    private String storeName;
    private Date storeTime;
    private Integer storeNum;//成交件数
    private Double storePrice;//总营业额
    private String superiorStore;//上级店铺
    private String checkOffCode;//核销码
    private Integer checkOffCodeNum;//核销码数量
}
