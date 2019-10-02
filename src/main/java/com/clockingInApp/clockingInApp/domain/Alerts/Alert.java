package com.clockingInApp.clockingInApp.domain.Alerts;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ChadMarthinussen2 on 2019/06/10.
 */
@Entity
public class Alert implements Comparable<Alert> {

    @Id
    private String alarmID;
    private String triggerAlarm;
    private String alert;

    public Alert(Builder builder) {
    }

    public String getAlarmID() {
        return alarmID;
    }

    public String getTriggerAlarm() {
        return triggerAlarm;
    }

    public String getAlert() {
        return alert;
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "alarmID='" + alarmID + '\'' +
                ", triggerAlarm='" + triggerAlarm + '\'' +
                ", alert='" + alert + '\'' +
                '}';
    }

    @Override
    public int compareTo(Alert o) {
        return this.alarmID.compareToIgnoreCase(o.alarmID);
    }

    public static class Builder{

        private String alarmID;
        private String triggerAlarm;
        private String alert;


        public Builder alarmID(String alarmID) {
            this.alarmID = alarmID;
            return this;
        }

        public Builder triggerAlarm(String triggerAlarm){
            this.triggerAlarm = triggerAlarm;
            return this;
        }

        public Builder alert(String alert) {
            this.alert = alert;
            return this;
        }

        public Alert build(){
            return new Alert(this);
        }

        public Builder copy(Alert alert){
            this.alarmID = alert.alarmID;
            this.triggerAlarm = alert.triggerAlarm;
            this.alert = alert.alert;
            return this;
        }

    }
}

