package com.wyb.dubbo.dubboapi.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderDto implements Serializable {
    private String no;
    private String id;
}
