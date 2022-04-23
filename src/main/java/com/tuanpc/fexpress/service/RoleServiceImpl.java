package com.tuanpc.fexpress.service;

import com.tuanpc.fexpress.model.Role;
import com.tuanpc.fexpress.reposiroty.mapper.RoleMapper;
import com.tuanpc.fexpress.reposiroty.sp.RoleSP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Role> getAllRole() {
        return jdbcTemplate.query(RoleSP.GET_ALL_ROLE, new RoleMapper());
    }

    @Override
    public Role getRoleById(int roleId) {
        return jdbcTemplate.queryForObject(RoleSP.GET_ROLE_BY_ID, new Object[]{roleId}, new RoleMapper());
    }

    @Override
    public Role getRoleByRoleName(String roleName) {
        return jdbcTemplate.queryForObject(RoleSP.GET_ROLE_BY_ROLE_NAME, new Object[]{roleName}, new RoleMapper());
    }
}
