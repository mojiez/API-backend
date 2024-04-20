package com.yichen.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yichen.project.model.entity.InterfaceInfo;
import com.yichen.project.model.entity.Post;
import com.yichen.project.model.entity.InterfaceInfo;

/**
*
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add 是否为创建校验
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
