package com.book.spring.xml;

import com.book.base.Person;
import com.book.base.PersonManager;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by Quang on 01/15/2017.
 */
public class FirstSimplePersonSaveTest {

    @Test
    public void savePerson() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/app-simple-config.xml");
        PersonManager personManager = context.getBean("personManager", PersonManager.class);

        int result = personManager.save(new Person("Vinh", "Nguyen", new Date()));

        Assert.assertThat(result, CoreMatchers.is(1));
    }
}
