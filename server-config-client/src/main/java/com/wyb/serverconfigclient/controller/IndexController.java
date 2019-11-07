package com.wyb.serverconfigclient.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class IndexController {
    @Value("${email}")
    private String email;
    @GetMapping("/")
    public String index(){
        log.info(email);
        return "配置中心";
    }
}
