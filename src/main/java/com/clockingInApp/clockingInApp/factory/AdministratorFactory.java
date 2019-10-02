package com.clockingInApp.clockingInApp.factory;

import com.clockingInApp.clockingInApp.domain.UserlType.Administrator;

/**
 * Created by ChadMarthinussen2 on 2019/04/17.
 */
public class AdministratorFactory {


    public static Administrator buildAdministrator(int administratorID, String isAdministrator, String canEdit) {
        return new Administrator.Builder().administratorID(administratorID).isAdministrator(isAdministrator).canEdit(canEdit).build();
    }
}



