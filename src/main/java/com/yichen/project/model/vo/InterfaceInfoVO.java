package com.yichen.project.model.vo;

import com.yichen.project.model.entity.Post;
import lombok.Data;
import lombok.EqualsAndHashCode;
import model.entity.InterfaceInfo;

/**
 * 帖子视图
 *
 * @author yupi
 * @TableName product
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoVO extends InterfaceInfo {
    // 继承接口信息 额外增加 统计的调用次数属性
    /**
     * 是否已点赞
     */
    private Integer totalNum;
    private static final long serialVersionUID = 1L;
}