package com.yichen.project.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import service.InnerUserInterfaceInfoService;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class UserInterfaceInfoServiceTest {
    @Resource
    private InnerUserInterfaceInfoService innerUserInterfaceInfoService;
    @Test
    public void testInvokeCount() {
        boolean b = innerUserInterfaceInfoService.invokeCount();
        Assertions.assertTrue(b);
    }
}