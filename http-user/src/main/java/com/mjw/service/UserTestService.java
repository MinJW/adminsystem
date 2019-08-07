package com.mjw.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2019/8/6 15:53
 * @Version 1.0.0
 **/
@FeignClient(name = "producer-user-service")
public interface UserTestService {

    @RequestMapping("/test/hello")
    String hello();

}
