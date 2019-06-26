package com.monkey.order.Controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.monkey.order.Bean.User;
import com.monkey.order.IOrder.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserMapper userMapper;

    // 订单服务调用会员服务
    @RequestMapping(value = "/getOrder")
    public String getOrder() {

        String url="http://app-eureka-member/getMember";
        String result = restTemplate.getForObject(url,String.class);
        System.out.println("订单服务调用会员服务result:" + result);
        return result;
    }
}
