package com.book.components;

import com.book.base.Person;
import com.book.base.PersonManager;
import com.book.base.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Quang on 01/15/2017.
 */
@Component(value = "personManager")
public class PersonManagerImpl implements PersonManager {

    private Logger logger = LoggerFactory.getLogger(PersonManagerImpl.class);

    @Autowired
    PersonRepository repository;

    @Override
    public int save(Person person) {
        logger.info("Person was saved!!!");
        return repository.save(person);
    }

}
