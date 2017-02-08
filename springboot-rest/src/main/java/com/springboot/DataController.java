package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * SpringBootDemo
 * <p>
 * Created by yang.tang on 2017/2/6 17:00.
 *
 * 1.定制根路径，默认为/，修改定义的话，需要在application.properties 里面配置spring.data.rest.base-path= /xx
 *
 * 2.定制节点路径，节点路径为 实体类 + s ,也就是 localhost:8080/persons, 修改的话，
 *   在实体类Repository 上使用@RepositoryRestResource 注解的path属性来修改。
 *   比如：@RepositoryRestResource("/people")
 *   访问路径为：localhost:8080/xx/people
 */

@RestController
public class DataController {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/")
    public String index() {
        return "welcome";
    }

    @RequestMapping("/save")
    public Person save(String name, Integer age, String address) {
        System.out.println("DataController.save");
        System.out.println("name = [" + name + "], age = [" + age + "], address = [" + address + "]");
        Person p = personRepository.save(new Person(null, name, age, address));
        return p;
    }

    @RequestMapping("/q1")
    public List<Person> q1(String address) {
        System.out.println("DataController.q1");
        System.out.println("address = [" + address + "]");
        List<Person> people = personRepository.findByAddress(address);
        return people;
    }

    @RequestMapping("/q2/{name}")
    public List<Person> q2(@PathVariable("name") String name) {
        System.out.println("DataController.q2");
        System.out.println("name = [" + name + "]");
        List<Person> people = personRepository.findByName(name);
        return people;
    }

    @RequestMapping("/q3")
    public List<Person> q3(String name, String address) {
        System.out.println("DataController.q3");
        System.out.println("name = [" + name + "], address = [" + address + "]");
        List<Person> people = personRepository.findByNameAndAddress(name, address);
        return people;
    }

    @RequestMapping("/q4")
    public List<Person> q4(String name, String address) {
        System.out.println("DataController.q4");
        System.out.println("name = [" + name + "], address = [" + address + "]");
        List<Person> people = personRepository.withNameAndAddressQuery(name, address);
        return people;
    }

    @RequestMapping("/sort")
    public List<Person> sort() {
        System.out.println("DataController.sort");
        List<Person> people = personRepository.findAll(new Sort(Direction.ASC, "age"));
        return people;
    }

    @RequestMapping("/page")
    public Page<Person> page(int page) {
        System.out.println("DataController.page");
        Page<Person> people = personRepository.findAll(new PageRequest(page,2));
        return people;
    }

    @RequestMapping(value = "/person", method = RequestMethod.DELETE)
    public void delete(int id) {
        System.out.println("DataController.delete");
        personRepository.delete(id);
    }

    @RequestMapping(value = "/person", method = RequestMethod.PUT)
    public Person update(Person p) {
        System.out.println("DataController.update");
        Person person = personRepository.save(p);
        return person;
    }
}
