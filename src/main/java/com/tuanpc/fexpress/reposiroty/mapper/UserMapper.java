package com.tuanpc.fexpress.reposiroty.mapper;

import com.tuanpc.fexpress.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setUserId(rs.getInt("userId"));
        user.setUsername(rs.getString("username"));
        user.setFirstName(rs.getString("firstName"));
        user.setLastName(rs.getString("lastName"));
        user.setPassword(rs.getString("password"));
        user.setUplineId(rs.getInt("uplineId"));
        user.setEmail(rs.getString("email"));
        user.setGender(rs.getInt("gender"));
        user.setFirstAddress(rs.getString("first_address"));
        user.setProvince(rs.getString("province"));
        user.setDistrict(rs.getString("district"));
        user.setPhone(rs.getString("phone"));
        user.setPhoto(rs.getString("photo"));
        user.setIdCard(rs.getString("id_card"));
        user.setLastLogin(rs.getString("lastLogin"));
        user.setCreatedBy(rs.getInt("createdBy"));
        user.setCreatedDate(rs.getTimestamp("createdDate"));
        user.setUpdatedBy(rs.getInt("updatedBy"));
        user.setUpdatedDate(rs.getTimestamp("updatedDate"));
        user.setLoginFail(rs.getInt("loginFail"));
        user.setRoleId(rs.getInt("roleId"));
        user.setVerificationCode(rs.getString("verification_code"));
        user.setStatus(rs.getInt("status"));
        user.setProvider(rs.getString("provider"));
        user.setPasswordChangeTime(rs.getString("password_changed_time"));
        return user;
    }
}
