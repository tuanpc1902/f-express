package com.tuanpc.fexpress.reposiroty.sp;

import org.springframework.stereotype.Repository;

public class RoleSP {
    public static final String GET_ALL_ROLE = "CALL up_fexpress_getAllRole";
    public static final String GET_ROLE_BY_ID = "CALL up_fexpress_getRoleById";
    public static final String GET_ROLE_BY_ROLE_NAME = "CALL up_fexpress_getRoleByRoleName";
}
