package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBootDemo
 * <p>
 * Created by JasonTang on 1/22/2017 4:44 PM.
 */
@RestController
public class AuthorController {

    @Autowired
    private AuthorSetting authorSetting;

    @RequestMapping("/")
    public String index () {
        return "author name is " + authorSetting.getName() + " author`s age is " + authorSetting.getAge();
    }
}
