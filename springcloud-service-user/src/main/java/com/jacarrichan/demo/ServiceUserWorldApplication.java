package com.jacarrichan.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class ServiceUserWorldApplication {

    @Value("${server.port}")
    private String port;

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
        c.setIgnoreUnresolvablePlaceholders(true);
        return c;
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceUserWorldApplication.class, args);
    }

    @RequestMapping("/")
    public String home() throws InterruptedException {
        //模仿业务执行需要的时间
        TimeUnit.MILLISECONDS.sleep(300);
        return "user,Hello World from port " + port;
    }
}
