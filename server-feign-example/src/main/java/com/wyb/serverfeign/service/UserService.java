package com.wyb.serverfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("server-provider")
public interface UserService {
    @GetMapping("/orders/{id}")
    String getData(@PathVariable int id);

}
