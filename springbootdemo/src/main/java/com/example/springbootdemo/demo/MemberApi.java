package com.example.springbootdemo.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberApi {

    private JdbcTemplate jdbcTemplate;

    @GetMapping("/members")
    public List<String> members() {
        return jdbcTemplate.queryForList(
                "select email from member order by email",
                String.class
        );
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


}
