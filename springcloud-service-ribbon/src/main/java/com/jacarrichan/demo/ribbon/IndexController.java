package com.jacarrichan.demo.ribbon;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class IndexController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/index")
    public String hello() {
        log.info("{}", this);
        return helloService.getHelloContent();
    }
}
