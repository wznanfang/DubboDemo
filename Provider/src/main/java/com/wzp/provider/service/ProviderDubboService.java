package com.wzp.provider.service;

import org.apache.dubbo.rpc.RpcException;

/**
 * @author zp.wei
 * @date 2023/8/1 10:08
 */
public interface ProviderDubboService {

    String getName(String username) throws RpcException;

}
