package com.yichen.project.model.dto.userInterfaceInfo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.yichen.project.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * 查询请求
 *
 * @author yupi
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserInterfaceInfoQueryRequest extends PageRequest implements Serializable {
    /**
     * id
     */
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
     * 剩余调用次数
     */
    private Integer leftnum;

    /**
     * 0-正常 1-禁用
     */
    private Integer status;

}