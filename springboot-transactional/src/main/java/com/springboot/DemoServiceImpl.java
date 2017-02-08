package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * SpringBootDemo
 * <p>
 * Created by yang.tang on 2017/2/7 11:16.
 */
@Service
public class DemoServiceImpl implements DemoService{

    @Autowired
    private PersonRepository personRepository;

    @Override
    @Transactional(rollbackFor = {IllegalArgumentException.class})
    public Person savePersonWithRollBack(Person person) {
        Person p = personRepository.save(person);
        if(person.getName().equals("Jason")) {
            throw new IllegalArgumentException("Jason已存在，数据将回滚");
        }
        return p;
    }

    @Override
    @Transactional(noRollbackFor = IllegalArgumentException.class)
    public Person savePersonWithoutRollBack(Person person) {
        Person p = personRepository.save(person);
        if(person.getName().equals("Jason")) {
            throw new IllegalArgumentException("Jason已存在，数据不会回滚");
        }
        return p;
    }
}
