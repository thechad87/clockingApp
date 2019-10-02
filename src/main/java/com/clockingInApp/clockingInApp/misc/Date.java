package com.clockingInApp.clockingInApp.misc;

import java.time.LocalDate;

public class Date {


    private LocalDate localDate = null;

    public LocalDate getLocalDate(){
        localDate = localDate.now();
        return localDate;
    }
}
