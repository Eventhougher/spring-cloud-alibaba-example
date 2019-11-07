package com.wyb.serversentinel.service;

import com.wyb.serversentinel.entity.Order;
import com.wyb.serversentinel.fallback.OrderServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "server-provider",fallback = OrderServiceFallBack.class)
public interface OrderService {

    @RequestMapping("/orders/{uid}")
    public String getOrders(@PathVariable int uid);

    @RequestMapping("/order")
    public Order getOrder();
}
