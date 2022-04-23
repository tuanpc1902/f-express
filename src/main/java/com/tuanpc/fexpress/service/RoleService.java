package com.tuanpc.fexpress.service;

import com.tuanpc.fexpress.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRole();
    Role getRoleById(int roleId);
    Role getRoleByRoleName(String roleName);
}
