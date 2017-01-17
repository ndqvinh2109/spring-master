package com.book.noaop;

import com.book.base.Person;
import com.book.base.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Created by Quang on 01/15/2017.
 */
@Repository(value = "personRepository")
public class JdbcPersonRepository implements PersonRepository{

    @Autowired
    private DataSource dataSource;

    @Override
    public int save(Person person) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String sql = "INSERT INTO person (firstname, lastname, date_of_birth) values (?,?,?)";
        return jdbcTemplate.update(sql, person.getFirstName(), person.getLastName(), person.getDateOfBirth());
    }

    @Override
    public void setDatasource(DataSource datasource) {
        this.dataSource = datasource;
    }
}
