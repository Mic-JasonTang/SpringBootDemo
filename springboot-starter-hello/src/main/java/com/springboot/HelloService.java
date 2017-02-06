package com.springboot;

/**
 * SpringBootDemo
 * <p>
 * Created by JasonTang on 2/5/2017 10:59 AM.
 *
 * 根据此类的存在与否来创建这个类的Bean
 */
public class HelloService {

    private String msg;

    public String sayHello() {
        return "Hello " + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
