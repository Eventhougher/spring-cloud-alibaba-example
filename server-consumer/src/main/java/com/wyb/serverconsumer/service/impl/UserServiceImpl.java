package com.wyb.serverconsumer.service.impl;

import com.wyb.serverconsumer.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private RestTemplate restTemplate;
    @Override
    public String getOrders(int uid) {
        return restTemplate.getForObject("http://server-provider/orders/"+uid,String.class);

    }
}
