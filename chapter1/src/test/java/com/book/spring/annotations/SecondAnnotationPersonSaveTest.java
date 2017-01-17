package com.book.spring.annotations;

import com.book.base.Person;
import com.book.base.PersonManager;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by Quang on 01/13/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class SecondAnnotationPersonSaveTest {

    @Autowired
    PersonManager personManager;

    @Test
    public void savePerson() {
        int result = personManager.save(new Person("Vinh", "Nguyen", new Date()));
        Assert.assertThat(result, CoreMatchers.is(1));
    }
}
