package com.wzp.consumer.controller;

import com.wzp.consumer.service.TestService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zp.wei
 * @date 2023/8/1 10:15
 */
@RestController
public class TestController {

    @Resource
    private TestService testService;


    @GetMapping("/test")
    public String test() {
        return testService.getName();
    }


}
