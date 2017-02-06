package com.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBootDemo
 * <p>
 * Created by JasonTang on 1/22/2017 1:18 PM.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World Spring Boot";
    }
}
