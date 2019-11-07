package com.wyb.serversentinel.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {
    private int orderId;
    private BigDecimal total;
}
