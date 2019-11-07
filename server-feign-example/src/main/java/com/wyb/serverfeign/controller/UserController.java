package com.wyb.serverfeign.controller;


import com.wyb.serverfeign.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/orders/{uid}")
    public String getData(@PathVariable int uid){
        return userService.getData(uid);
    }

}
