package com.yichen.project.model.dto.userInterfaceInfo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;

import java.util.Date;

//  一个用户 对应 一个接口

/**
 * 新增用户接口信息
 */
public class UserInterfaceInfoAddRequest {

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

}
