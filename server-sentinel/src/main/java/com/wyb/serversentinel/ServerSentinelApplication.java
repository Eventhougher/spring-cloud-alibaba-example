package com.wyb.serversentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 后台配置降级  限流
 * 客服端  也可以配置
 * 提供者配置
 * 消费者配置
 *
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class ServerSentinelApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerSentinelApplication.class, args);
    }

}
