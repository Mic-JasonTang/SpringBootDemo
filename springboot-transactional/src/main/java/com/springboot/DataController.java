package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBootDemo
 * <p>
 * Created by yang.tang on 2017/2/7 11:27.
 */
@RestController
public class DataController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/rollback", method = RequestMethod.POST)
    public Person rollback(Person person) {
        return demoService.savePersonWithRollBack(person);
    }

    @RequestMapping("/norollback")
    public Person noRollback(Person person) {
        return demoService.savePersonWithoutRollBack(person);
    }
}
