package com.tuanpc.fexpress.controller;

import com.tuanpc.fexpress.contant.UrlApiCommon;
import com.tuanpc.fexpress.model.User;
import com.tuanpc.fexpress.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@CrossOrigin("*")
@RestController
@RequestMapping(UrlApiCommon.URL_COMMON_API + "/user")
public class UserControllerAPI {

    private static final String STATUS = "status";
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all-user", method = RequestMethod.GET)
    public HashMap<String, Object> getAllUser(){
        HashMap<String, Object> jsonResponse = new HashMap<>();
        jsonResponse.put("allUser", userService.getAllUser());
        return jsonResponse;
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


