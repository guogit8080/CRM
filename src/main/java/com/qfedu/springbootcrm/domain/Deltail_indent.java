package com.qfedu.springbootcrm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@TableName("detail_indent")
public class Deltail_indent {
    @TableId(type = IdType.AUTO)
    private Integer did;
    private Integer iid;
    private Integer sid;
    private Integer taglib;
    private Integer num;
}
