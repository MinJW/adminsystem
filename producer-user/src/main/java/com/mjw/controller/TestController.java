package com.mjw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2019/8/6 15:38
 * @Version 1.0.0
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello cloud!";
    }

}
