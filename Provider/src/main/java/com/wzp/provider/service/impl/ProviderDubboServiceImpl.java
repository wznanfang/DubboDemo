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
    public String getName(String username) {
        String name = "南风落尽";
        if (!username.equals(name)) {
            throw new RuntimeException("哦豁, 数据错误嘞!");
        }
        return name;
    }


}
