package com.jacarrichan.demo.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/index")
    public String hello() {
        return helloService.getHelloContent();
    }
}
