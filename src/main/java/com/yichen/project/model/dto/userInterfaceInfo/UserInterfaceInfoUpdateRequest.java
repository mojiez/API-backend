package com.yichen.project.model.dto.userInterfaceInfo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 更新请求
 *
 * @TableName product
 */
@Data
public class UserInterfaceInfoUpdateRequest implements Serializable {
    /**
     * id 指定更新哪条数据
     */
    private Long id;

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

}