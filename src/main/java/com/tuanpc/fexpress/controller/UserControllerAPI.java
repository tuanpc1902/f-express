package com.tuanpc.fexpress.controller;

import com.tuanpc.fexpress.contant.UrlApiCommon;
import com.tuanpc.fexpress.model.User;
import com.tuanpc.fexpress.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(UrlApiCommon.URL_COMMON_API + "/user")
public class UserControllerAPI {

    private static final String STATUS = "status";
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all-user", method = RequestMethod.GET)
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @RequestMapping(value = "/id/{userId}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("userId") int userId){
        HashMap<String, User> response = new HashMap<>();
        User user = userService.getUserById(userId);
        if (user != null){
            return response.put("userInfo", user);
        }
        return userService.getUserById(userId);
    }

    @RequestMapping(value = "/username/{username}", method = RequestMethod.GET)
    public User getUserByUsername(@PathVariable("username") String username){
        return userService.getUserByUsername(username);
    }
}


