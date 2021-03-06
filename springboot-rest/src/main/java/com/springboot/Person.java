package com.springboot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * SpringBootDemo
 * <p>
 * Created by yang.tang on 2017/2/6 14:56.
 *
 * 没有使用@Table (实体类映射表名)，@Column (属性映射字段名) 注解。
 * 这是因为采用的是正向工程通过实体类生成表结构，而不是通过逆向工程从表结构生成实体类。
 */
//@Entity 注解指明这是一个和数据库表映射的实体类
@Entity
public class Person {

    //@Id 注解指明这个属性映射为数据库的主键
    @Id
    //@GeneratedValue 注解默认使用主键的生成方式为自增
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
