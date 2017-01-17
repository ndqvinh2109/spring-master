package com.book.spring.aop;

import com.book.base.Person;
import com.book.base.PersonManager;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by Quang on 01/15/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/app-aop-cfg.xml", "classpath:spring/test-db-config.xml"})
@Transactional(transactionManager = "txManager")
public class AopTransactionalSavePersonTest {

    @Autowired
    @Qualifier("personManager")
    PersonManager personManager;

    @Test
    public void savePerson() {
        int result = personManager.save(new Person("Vinh", "Nguyen", new Date()));
        Assert.assertEquals(result, 1);
    }
}
