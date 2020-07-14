package com.jacarrichan.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-helloworld", fallback = HelloWorldFeignClientFailure.class)
public interface HelloFeignClient {

        @RequestMapping(value = "/",method = RequestMethod.GET)
        String getHelloContent();
}