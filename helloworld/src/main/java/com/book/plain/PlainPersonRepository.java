package com.book.plain;

import com.book.base.Person;
import com.book.base.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;

/**
 * Created by Quang on 01/12/2017.
 */
public class PlainPersonRepository implements PersonRepository {

    private Logger logger = LoggerFactory.getLogger(PlainPersonRepository.class);
    private DataSource dataSource;

    @Override
    public void setDatasource(DataSource datasource) {
       this.dataSource = datasource;
    }

    @Override
    public int save(Person person) {
        logger.info("Person was saved");
        return 1;
    }
}
