package com.yichen.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import model.entity.UserInterfaceInfo;

import java.util.List;

/**
 * @Entity generator.domain.UserInterfaceInfo
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {
    // Select interfaceInfoId , sum(totalNum) as totalNum from user_interface_info group by interfaceInfoId order by totalNum desc limit 3
    public List<UserInterfaceInfo> listTopInterfaceInfoInvoke(int limit);
}




