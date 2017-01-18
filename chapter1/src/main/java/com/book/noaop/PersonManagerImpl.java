package com.book.noaop;

import com.book.base.Person;
import com.book.base.PersonManager;
import com.book.base.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * Created by Quang on 01/15/2017.
 */
@Component(value = "personManager")
public class PersonManagerImpl implements PersonManager {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    PlatformTransactionManager transactionManager;

    @Override
    public int save(Person person) {
        TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
        TransactionStatus status = transactionManager.getTransaction(transactionDefinition);
        int result = personRepository.save(person);
        transactionManager.commit(status);
        return result;
    }

}
