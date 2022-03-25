package com.zhong.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.hello}")
    private  String testHello;

    @GetMapping("/hello")
    public String hello(){
        return "hello world"+testHello;
    }

    @PostMapping("/hello/post")
    public String hellopost(String name){
        return "hello world! Post,"+name;
    }
}
