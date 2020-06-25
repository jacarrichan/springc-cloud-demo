package com.jacarrichan.demo.feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
public class IndexController {

    @Resource
    private HelloFeignClient helloFeignClient;
    @Resource
    private UserFeignClient userFeignClient;

    @GetMapping(value = "/index")
    public String hello() {
        System.out.println("Enter hello world service!");
        return helloFeignClient.getHelloContent();
    }

    @GetMapping(value = "/user")
    public String user() {
        System.out.println("Enter hello world service!");
        return userFeignClient.getHelloContent();
    }
}
