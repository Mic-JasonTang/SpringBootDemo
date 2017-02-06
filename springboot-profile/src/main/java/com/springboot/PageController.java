package com.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBootDemo
 * <p>
 * Created by JasonTang on 1/22/2017 6:05 PM.
 */
@RestController
public class PageController {

    @RequestMapping("/index")
    public String index() {
        return "this is web page";
    }
}
