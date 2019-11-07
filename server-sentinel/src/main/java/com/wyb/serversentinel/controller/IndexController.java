package com.wyb.serversentinel.controller;

import com.wyb.serversentinel.service.OrderService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class IndexController {
    @Resource
    OrderService orderService;

    @RequestMapping("/{uid}")
    public String index(@PathVariable int uid){
        String orders = orderService.getOrders(uid);
        return orders;
    }
}
