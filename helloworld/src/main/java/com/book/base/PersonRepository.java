package com.book.base;

import javax.sql.DataSource;

/**
 * Created by Quang on 01/12/2017.
 */
public interface PersonRepository {
    int save(Person person);
    void setDatasource(DataSource datasource);
}
