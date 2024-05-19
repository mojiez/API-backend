package com.yichen.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yichen.project.mapper.UserInterfaceInfoMapper;

import model.entity.InterfaceInfo;
import model.entity.User;
import model.entity.UserInterfaceInfo;
import org.springframework.stereotype.Service;
import service.InnerUserInterfaceInfoService;

/**
 *
 */
@Service
public class InnerUserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
    implements InnerUserInterfaceInfoService {

    @Override
    public boolean invokeCount() {
        return true;
    }
}




