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

    @GetMapping(value = "/index")
    public String hello() {
        System.out.println("Enter hello world service!");
        return helloFeignClient.getHelloContent();
    }
}
