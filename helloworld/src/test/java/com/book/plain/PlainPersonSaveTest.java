package com.book.plain;

import com.book.base.Person;
import com.book.base.PersonManager;
import com.book.base.PersonRepository;
import org.apache.commons.dbcp.BasicDataSource;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;

import javax.sql.DataSource;
import java.util.Date;

/**
 * Created by Quang on 01/12/2017.
 */
public class PlainPersonSaveTest {

    @Test
    public void savePerson() {
        PersonRepository personRepository = new PlainPersonRepository();
        DataSource dataSource = new BasicDataSource();
        personRepository.setDatasource(dataSource);
        PersonManager personManager = new PlainPersonManagerImpl(personRepository);
        Person person = new Person("Vinh", "Nguyen", new Date());

        int result = personManager.save(person);

        Assert.assertThat(result, CoreMatchers.is(1));
    }
}
