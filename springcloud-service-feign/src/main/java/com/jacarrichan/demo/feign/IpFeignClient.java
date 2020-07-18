package com.jacarrichan.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(name = "IpFeignClient", url = "http://ip-api.com/")
public interface IpFeignClient {
    @RequestMapping(method = GET, value = "/json/?lang=zh-CN")
    String json();
}
