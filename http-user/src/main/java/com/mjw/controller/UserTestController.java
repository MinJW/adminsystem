package com.mjw.controller;

import com.mjw.service.UserTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2019/8/6 15:53
 * @Version 1.0.0
 **/
@RestController
@RequestMapping("/user")
public class UserTestController {

    @Autowired
    private UserTestService userTestService;

    @RequestMapping("/hello")
    public String hello(){
        return userTestService.hello();
    }

}
