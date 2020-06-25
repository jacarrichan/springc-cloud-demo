package com.jacarrichan.demo.feign;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldFeignClientFailure implements HelloFeignClient {

    @Override
    public String getHelloContent() {
        System.out.println("hello world service is not available !");
        return "hello world service is not available !";
    }
}
