package com.qfedu.springbootcrm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@Data
@NoArgsConstructor
@TableName("indent")
public class Indent {
    @TableId(type = IdType.AUTO)
    private Integer did;
    private Integer uid;
    private Integer indentNumber;
    private Integer storeId;
    private Double price;
    private String buyPersonName;
    private String indentStatus;
    private String clearStatus;
    private String pack_company;
    private Integer packNumber;
    private String packType;
    private String createUser;
    private Date createdTime;
    private String modifiedUser;
    private Date modifiedTime;
}
