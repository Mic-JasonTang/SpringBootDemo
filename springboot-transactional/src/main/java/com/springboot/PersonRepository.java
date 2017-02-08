package com.springboot;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * SpringBootDemo
 * <p>
 * Created by yang.tang on 2017/2/7 11:14.
 */
public interface PersonRepository extends JpaRepository<Person, Integer>{

}
