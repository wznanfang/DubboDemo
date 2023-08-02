package com.wzp.consumer.service.impl;

import com.wzp.consumer.service.TestService;
import com.wzp.provider.service.ProviderDubboService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author zp.wei
 * @date 2023/8/1 11:27
 */
@Service
public class TestServiceImpl implements TestService {

    @DubboReference
    private ProviderDubboService providerDubboService;


    @Override
    public String getName(String username) {
        return providerDubboService.getName(username);
    }
}
