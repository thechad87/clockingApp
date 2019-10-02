package com.clockingInApp.clockingInApp.factory;

import com.clockingInApp.clockingInApp.domain.AccessTypes.TurnStileAccess;
import com.clockingInApp.clockingInApp.misc.Time;

/**
 * Created by ChadMarthinussen2 on 2019/06/11.
 */
public class TurnStileAccessFactory {

    public static TurnStileAccess buildTurnStileAccess(String turnStileAccessID, String validUserAccess, Time clockingTimes){
//        return new TurnStileAccess.Builder().turnStileAccessID(turnStileAccessID).validUserAccess(validUserAccess).clockingTimes(clockingTimes).build();
        //        return new TurnStileAccess.Builder().turnStileAccessID(turnStileAccessID).validUserAccess(validUserAccess).clockingTimes(clockingTimes).build();
        return new TurnStileAccess.Builder().turnStileAccessID(turnStileAccessID).validUserAccess(validUserAccess).build();

    }
}
