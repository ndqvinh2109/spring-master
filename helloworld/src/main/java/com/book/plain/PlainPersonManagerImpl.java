package com.book.plain;

import com.book.base.Person;
import com.book.base.PersonManager;
import com.book.base.PersonRepository;

/**
 * Created by Quang on 01/12/2017.
 */
public class PlainPersonManagerImpl implements PersonManager {

    PersonRepository personRepository;

    public PlainPersonManagerImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public int save(Person person) {
        return personRepository.save(person);
    }
}
