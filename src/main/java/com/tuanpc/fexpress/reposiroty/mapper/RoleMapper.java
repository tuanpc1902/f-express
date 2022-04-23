package com.tuanpc.fexpress.reposiroty.mapper;

import com.tuanpc.fexpress.model.Role;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RoleMapper implements RowMapper<Role> {
    @Override
    public Role mapRow(ResultSet rs, int rowNum) throws SQLException {
        Role role = new Role();
        role.setRoleId(rs.getInt("roleId"));
        role.setRoleName(rs.getString("roleName"));
        return role;
    }
}
