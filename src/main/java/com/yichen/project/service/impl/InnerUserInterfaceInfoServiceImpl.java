package com.yichen.project.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yichen.project.common.ErrorCode;
import com.yichen.project.exception.BusinessException;
import com.yichen.project.mapper.UserInterfaceInfoMapper;

import com.yichen.project.service.UserInterfaceInfoService;
import model.entity.InterfaceInfo;
import model.entity.User;
import model.entity.UserInterfaceInfo;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;
import service.InnerUserInterfaceInfoService;

import javax.annotation.Resource;

/**
 *
 */
@Service
@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {
    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        // 直接调用
        return userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
    }
}




