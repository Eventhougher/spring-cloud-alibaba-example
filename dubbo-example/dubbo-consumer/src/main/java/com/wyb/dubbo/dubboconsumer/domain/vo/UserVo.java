package com.wyb.dubbo.dubboconsumer.domain.vo;

import com.wyb.dubbo.dubboapi.dto.OrderDto;
import lombok.Data;

import java.util.List;

@Data
public class UserVo {
    private Integer uid;
    private String username;
    private List<OrderDto> orders;
}
