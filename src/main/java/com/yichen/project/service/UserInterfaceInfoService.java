package com.yichen.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import model.entity.UserInterfaceInfo;

public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    boolean invokeCount(long interfaceInfoId, long userId);
}
