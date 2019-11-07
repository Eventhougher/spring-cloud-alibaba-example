package com.wyb.serverconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServerConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerConfigClientApplication.class, args);
    }

}
