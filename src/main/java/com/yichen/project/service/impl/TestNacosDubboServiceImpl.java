package com.yichen.project.service.impl;

import com.yichen.project.service.TestNacosDubboService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class TestNacosDubboServiceImpl implements TestNacosDubboService {
    @Override
    public String sayCao() {
        return "WDNMD";
    }
}
