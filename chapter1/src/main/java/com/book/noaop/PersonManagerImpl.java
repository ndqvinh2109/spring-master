package com.book.noaop;

import com.book.base.Person;
import com.book.base.PersonManager;
import com.book.base.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Quang on 01/15/2017.
 */
@Component(value = "personManager")
@Transactional
public class PersonManagerImpl implements PersonManager {

    @Autowired
    @Qualifier("personRepository")
    PersonRepository personRepository;

    @Override
    public int save(Person person) {
        return personRepository.save(person);
    }
}
