package com.springboot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * SpringBootDemo
 * <p>
 * Created by yang.tang on 2017/2/6 14:56.
 */
@Entity
public class Person {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int age;

    private String address;

    public Person() {

    }

    public Person(Integer id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
