package com.wyb.serverconsumer.controller;

import com.wyb.serverconsumer.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/orders/{uid}")
    public String userOrders(@PathVariable int uid){
        String orders = userService.getOrders(uid);
        return orders;
    }
}
