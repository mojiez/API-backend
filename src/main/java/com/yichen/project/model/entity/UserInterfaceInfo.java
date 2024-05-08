package com.yichen.project.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户接口关系表
 * @TableName user_interface_info
 */
@TableName(value ="user_interface_info")
@Data
public class UserInterfaceInfo implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    private Long userid;

    /**
     * 被调用接口id
     */
    private Long interfaceinfoid;

    /**
     * 总调用次数
     */
    private Integer totalnum;

    /**
     * 总调用次数
     */
    private Integer leftnum;

    /**
     * 0-正常 1-禁用
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 是否删除
     */
    @TableLogic
    private Byte isdelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}