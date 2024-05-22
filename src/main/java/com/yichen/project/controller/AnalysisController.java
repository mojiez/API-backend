package com.yichen.project.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.yichen.project.annotation.AuthCheck;
import com.yichen.project.common.BaseResponse;
import com.yichen.project.common.ErrorCode;
import com.yichen.project.common.ResultUtils;
import com.yichen.project.exception.BusinessException;
import com.yichen.project.mapper.UserInterfaceInfoMapper;
import com.yichen.project.model.vo.InterfaceInfoVO;
import com.yichen.project.service.InterfaceInfoService;
import lombok.extern.slf4j.Slf4j;
import model.entity.InterfaceInfo;
import model.entity.UserInterfaceInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 分析控制器
 */
@RestController
@RequestMapping("/analysis")
@Slf4j
public class AnalysisController {
    @Resource
    private UserInterfaceInfoMapper userInterfaceInfoMapper;

    @Resource
    private InterfaceInfoService interfaceInfoService;
    @GetMapping("/top/interface/invoke")
    @AuthCheck(mustRole = "admin")
    public BaseResponse<List<InterfaceInfoVO>> listTopInterfaceInfoInvoke() {
        List<UserInterfaceInfo> userInterfaceInfos = userInterfaceInfoMapper.listTopInterfaceInfoInvoke(3);
        // 根据接口id分组
        Map<Long, List<UserInterfaceInfo>> interfaceInfoIdObjMap = userInterfaceInfos.stream()
                .collect(Collectors.groupingBy(UserInterfaceInfo::getInterfaceinfoid));
        QueryWrapper<InterfaceInfo>queryWrapper = new QueryWrapper<>();
        queryWrapper.in("id", interfaceInfoIdObjMap.keySet());
        List<InterfaceInfo> list = interfaceInfoService.list(queryWrapper);
        if (CollectionUtils.isEmpty(list)) {
            throw new BusinessException(ErrorCode.SYSTEM_ERROR);
        }
        List<InterfaceInfoVO> interfaceInfoVOList = list.stream()
                .map(item -> {
                    InterfaceInfoVO interfaceInfoVO = new InterfaceInfoVO();
                    BeanUtils.copyProperties(item, interfaceInfoVO);
                    int totalNum = interfaceInfoIdObjMap.get(item.getId()).get(0).getTotalnum();
                    interfaceInfoVO.setTotalNum(totalNum);
                    return interfaceInfoVO;
                }).collect(Collectors.toList());
        return ResultUtils.success(interfaceInfoVOList);
    }
}
