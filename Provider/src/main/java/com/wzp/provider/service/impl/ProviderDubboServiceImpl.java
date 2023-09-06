package com.wzp.provider.service.impl;

import com.wzp.provider.service.ProviderDubboService;
import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcException;

/**
 * @author zp.wei
 * @date 2023/8/1 10:11
 */
@DubboService
@AllArgsConstructor
public class ProviderDubboServiceImpl implements ProviderDubboService {


    @Override
    public String getName(String username) throws RpcException {
        String name = "南风落尽";
        //模拟运行异常
        /*List<Integer> list = new ArrayList<>();
        for (int i = 0; i < list.size()+1; i++) {
            System.err.println(list.get(i));
        }*/
        //模拟代码处理异常
        if (!username.equals(name)) {
            throw new RpcException(10000, "哦豁, 数据错误嘞!");
        }
        return name;
    }


}
