package com.jacarrichan.demo.feign;

import com.jacarrichan.demo.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-user", configuration = FeignConfiguration.class)
public interface UserFeignClient {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String getHelloContent();
}