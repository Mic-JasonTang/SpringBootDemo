package com.springboot;

/**
 * SpringBootDemo
 * <p>
 * Created by yang.tang on 2017/2/7 11:15.
 */
public interface DemoService {

    public Person savePersonWithRollBack(Person person);
    public Person savePersonWithoutRollBack(Person person);
}
