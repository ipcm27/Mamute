package com.myCompany.Mamute.Repository;

import com.myCompany.Mamute.Entity.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> findAll() {
        String sql = "SELECT * FROM PERSON";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Person>(Person.class));
    }


}
