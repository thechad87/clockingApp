package com.clockingInApp.clockingInApp.factory;

import com.clockingInApp.clockingInApp.domain.UserlType.Staff;

/**
 * Created by ChadMarthinussen2 on 2019/04/10.
 * student number : 208031197
 *
 */

public class StaffFactory {

    public static Staff buildStaff(int staffID, String name, String secondName, String lateName){
        return new Staff.Builder().staffID(staffID).secondName(secondName).lateName(lateName).build();
    }
}
