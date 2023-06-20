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
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)
    private Integer uid;
    private String username;
    private String password;
    private String salt;
    private String userImg;
    private String telphone;
    private String money;
    private String TransactionNum;//成交次数
    private String createUser;
    private Date createdTime;
    private String modifiedUser;
    private Date modifiedTime;
}
