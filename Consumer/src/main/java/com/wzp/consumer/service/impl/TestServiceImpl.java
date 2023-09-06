package com.wzp.consumer.service.impl;

import com.wzp.consumer.service.TestService;
import com.wzp.provider.service.ProviderDubboService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.rpc.RpcException;
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
        String name = null;
        try {
            name = providerDubboService.getName(username);
        } catch (RpcException re) {
            String errorMessage = re.getMessage();
            System.err.println(errorMessage);
        }
        return name;
    }


}
