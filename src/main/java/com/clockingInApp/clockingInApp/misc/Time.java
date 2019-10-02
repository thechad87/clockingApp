package com.clockingInApp.clockingInApp.misc;

import java.time.LocalTime;

public class Time {

    private LocalTime localTime = null;

    public LocalTime getLocalTime(int hours, int minutes, int seconds){
        localTime =  LocalTime.of(hours, minutes ,seconds);
        return localTime;
    }
}
