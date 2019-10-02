package com.clockingInApp.clockingInApp.factory;

import com.clockingInApp.clockingInApp.domain.AccessTypes.PasswordCredential;

/**
 * Created by ChadMarthinussen2 on 2019/04/30.
 */
public class PasswordCredentialFactory {

    public static PasswordCredential buildPasswordCredential(String userPasswordCredentials, String userName, String userEmailAddress){
        return new PasswordCredential.Builder().userPasswordCredentials(userPasswordCredentials).userName(userName).userEmailAddress(userEmailAddress).build();
    }
}


