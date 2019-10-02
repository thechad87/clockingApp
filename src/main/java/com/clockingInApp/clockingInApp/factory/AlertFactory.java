package com.clockingInApp.clockingInApp.factory;

import com.clockingInApp.clockingInApp.domain.Alerts.Alert;


/**
 * Created by ChadMarthinussen2 on 2019/09/13.
 */
public class AlertFactory {

    public static Alert.Builder buildAlarm(String alarmID, String triggerAlarm, String alert){
           return new Alert.Builder().alarmID(alarmID).triggerAlarm(triggerAlarm).alert(alert);
    }
}
