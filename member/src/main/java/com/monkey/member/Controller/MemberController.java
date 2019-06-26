package com.monkey.member.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/getMember" )
    public String getMember() {
        return "this is member，我是会员服务,springcloud2.0版本,端口号:" + serverPort;
    }
}
