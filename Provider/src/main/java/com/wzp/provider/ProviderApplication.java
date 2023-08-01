package com.wzp.provider;


import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@DubboComponentScan
@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) {
        System.err.println("启动成功");
        SpringApplication.run(ProviderApplication.class, args);
    }

}
