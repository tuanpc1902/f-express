package com.tuanpc.fexpress.controller;

import com.tuanpc.fexpress.contant.UrlApi;
import com.tuanpc.fexpress.model.Role;
import com.tuanpc.fexpress.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@CrossOrigin("*")
@RestController
@RequestMapping(UrlApi.URL_COMMON_API + "/role")
public class RoleControllerAPI {

    @Autowired
    RoleService roleService;

    @RequestMapping(value = "/all-role", method = RequestMethod.GET)
    public HashMap<String, Object> getAllRole(){
        HashMap<String, Object> response = new HashMap<>();
        response.put("allRole", roleService.getAllRole());
        return response;
    };

    @RequestMapping(value = "/id/{roleId}", method = RequestMethod.GET)
    public Role getRoleById(@PathVariable("roleId") int roleId){
        return roleService.getRoleById(roleId);
    };

    @RequestMapping(value = "/name/{roleName}", method = RequestMethod.GET)
    public Role getRoleByName(@PathVariable("roleName") String roleName){
        return roleService.getRoleByRoleName(roleName);
    };
}
