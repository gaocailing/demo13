package com.example.demo13;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class zouye {
@RequestMapping(value = "/hello")
    public String hellosay(){
    return "我的宝贝欢迎回家咯";
}
}
