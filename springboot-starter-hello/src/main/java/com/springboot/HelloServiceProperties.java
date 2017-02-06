package com.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * SpringBootDemo
 * <p>
 * Created by JasonTang on 2/5/2017 10:56 AM.
 *
 * 在application.properties中通过hello.msg来设置，若不设置msg，msg默认为word
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {

    private static final String MSG = "world";

    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
