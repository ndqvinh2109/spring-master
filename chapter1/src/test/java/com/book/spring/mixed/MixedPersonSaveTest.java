package com.book.spring.mixed;

import com.book.base.Person;
import com.book.base.PersonManager;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by Quang on 01/15/2017.
 */
public class MixedPersonSaveTest {

    @Test
    public void savePerson() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/mixed-app-config.xml",
                "classpath:spring/test-db-config.xml");
        PersonManager personManager = context.getBean("personManager", PersonManager.class);
        int result = personManager.save(new Person("Dang Quang Vinh", "Nguyen", new Date()));
        Assert.assertEquals(result, 1);
    }
}
