package com.book.components;

import com.book.base.Person;
import com.book.base.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Created by Quang on 01/15/2017.
 */
@Repository(value = "personRepository")
public class FakePersonRepository implements PersonRepository {

    private Logger logger = LoggerFactory.getLogger(FakePersonRepository.class);

    @Autowired
    private DataSource dataSource;


    @Override
    public int save(Person person) {
        logger.info("Person was saved!!!!!");
        return 1;
    }

    @Override
    public void setDatasource(DataSource datasource) {
        this.dataSource = datasource;
    }
}
