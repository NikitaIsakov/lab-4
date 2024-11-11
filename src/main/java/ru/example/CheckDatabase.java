package ru.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CheckDatabase {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void checkDatabase() {
        String dbName = jdbcTemplate.queryForObject("SELECT current_database();", String.class);
        System.out.println("Connected to database: " + dbName);
    }
}
