package com.tuanpc.fexpress.reposiroty.sp;

public class UserSP {
    public static final String GET_ALL_USER = "call up_fexpress_getAllUser()";
    public static final String GET_USER_BY_ID = "CALL up_fexpress_getUserById(?)";
    public static final String GET_USER_BY_USERNAME = "CALL up_fexpress_getUserByUsername(?)";
}
