package com.tutorialspoint.zullserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ZullServerApplication{

    public static void main(String[] args) {
        SpringApplication.run(ZullServerApplication.class, args);
    }

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }
}
