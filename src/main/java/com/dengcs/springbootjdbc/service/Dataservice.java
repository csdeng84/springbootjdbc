package com.dengcs.springbootjdbc.service;

import com.dengcs.springbootjdbc.dao.User;
import com.dengcs.springbootjdbc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class Dataservice implements UserMapper {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(String userid) {
        String sql = "insert into user( userid,username,age) " +
                " values(null,?,?)";
        return jdbcTemplate.update(sql, "dengcs", "19");
    }
}
