package com.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * SpringBootDemo
 * <p>
 * Created by JasonTang on 1/22/2017 4:43 PM.
 */
@Component
@ConfigurationProperties(prefix = "author")
public class AuthorSetting {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
