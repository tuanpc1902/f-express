package com.tuanpc.fexpress.service;

import com.tuanpc.fexpress.model.User;
import com.tuanpc.fexpress.reposiroty.mapper.UserMapper;
import com.tuanpc.fexpress.reposiroty.sp.UserSP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getAllUser() {
        return jdbcTemplate.query(UserSP.GET_ALL_USER, new UserMapper());
    }

    @Override
    public User getUserById(int userId) {
        return jdbcTemplate.queryForObject(UserSP.GET_USER_BY_ID, new Object[]{userId}, new UserMapper());
    }

    @Override
    public User getUserByUsername(String username) {
        return jdbcTemplate.queryForObject(UserSP.GET_USER_BY_USERNAME, new Object[]{username}, new UserMapper());
    }
}
