package com.wyb.dubbo.dubboprovider.service;

import com.wyb.dubbo.dubboapi.OrderService;
import com.wyb.dubbo.dubboapi.dto.OrderDto;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public List<OrderDto> getOrders() {
        List<OrderDto> orderDtoList = new ArrayList<>();
        OrderDto order = new OrderDto();
        order.setId("1");
        order.setNo("20191106123");
        orderDtoList.add(order);
        return orderDtoList;
    }
}
