package com.wyb.dubbo.dubboapi;

import com.wyb.dubbo.dubboapi.dto.OrderDto;

import java.util.List;

public interface OrderService {
    List<OrderDto> getOrders();
}
