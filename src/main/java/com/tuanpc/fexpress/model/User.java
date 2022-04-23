package com.tuanpc.fexpress.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class User {
    private int userId;
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private int uplineId;
    private String email;
    private int gender;
    private String firstAddress;
    private String province;
    private String district;
    private String phone;
    private String photo;
    private String idCard;
    private String lastLogin;
    private int createdBy;
    private Timestamp createdDate;
    private int updatedBy;
    private Timestamp updatedDate;
    private int loginFail;
    private int roleId;
    private String verificationCode;
    private String passwordChangeTime;
    private String provider;
    private int status;
}
