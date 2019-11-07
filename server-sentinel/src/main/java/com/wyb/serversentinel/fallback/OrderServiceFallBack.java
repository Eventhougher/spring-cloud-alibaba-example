package com.wyb.serversentinel.fallback;


import com.wyb.serversentinel.entity.Order;
import com.wyb.serversentinel.service.OrderService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Component
public class OrderServiceFallBack implements OrderService {
    @Override
    public String getOrders(int uid) {
        return "网络不给力";
    }

    @Override
    public Order getOrder() {
        Order order = new Order();
        order.setTotal(new BigDecimal(0.00));
        return order;
    }
}
