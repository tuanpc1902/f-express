package com.tuanpc.fexpress.service;

import com.tuanpc.fexpress.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUserById(int userId);
    User getUserByUsername(String username);
}
