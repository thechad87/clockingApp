package com.clockingInApp.clockingInApp.factory;

import com.clockingInApp.clockingInApp.domain.AccessTypes.Authorization;

/**
 * Created by ChadMarthinussen2 on 2019/04/30.
 */
public class AuthorizationFactory {

    public static Authorization buildAuthorization(String userTypeID, String verifyUserAccess){
        return new Authorization.Builder().userTypeID(userTypeID).verifyUserAccess(verifyUserAccess).build();
    }
}

