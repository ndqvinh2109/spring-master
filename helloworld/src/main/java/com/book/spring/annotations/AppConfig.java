package com.book.spring.annotations;

import com.book.base.PersonManager;
import com.book.base.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import com.book.plain.PlainPersonManagerImpl;
import com.book.plain.PlainPersonRepository;

import javax.sql.DataSource;

/**
 * Created by Quang on 01/12/2017.
 */
@Configuration
@PropertySource(value = "classpath:datasource/db.properties")
public class AppConfig {
    @Autowired
    Environment environment;

    @Bean(name="personManager")
    public PersonManager getPersonManager() {
        return new PlainPersonManagerImpl(getPersonRepository());
    }

    @Bean(name="personRepository")
    private PersonRepository getPersonRepository() {
        PersonRepository repo = new PlainPersonRepository();
        repo.setDatasource(getDatasource());
        return repo;
    }

    @Bean(name="dataSource")
    private DataSource getDatasource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getProperty("driverClassName"));
        dataSource.setUrl(environment.getProperty("url"));
        dataSource.setUsername(environment.getProperty("username"));
        dataSource.setPassword(environment.getProperty("password"));
        return dataSource;
    }
}
