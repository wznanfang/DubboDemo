package com.wzp.provider.service.impl;

import com.wzp.provider.service.ProviderDubboService;
import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author zp.wei
 * @date 2023/8/1 10:11
 */
@DubboService
@AllArgsConstructor
public class ProviderDubboServiceImpl implements ProviderDubboService {


    @Override
    public String getName() {
        String name;
        try {
            name = "南风落尽";
            System.err.println(1 / 0);
        } catch (Exception e) {
            throw new RuntimeException("数据错误!");
        }
        return name;
    }


}
