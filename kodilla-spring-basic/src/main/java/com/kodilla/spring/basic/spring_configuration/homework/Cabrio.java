package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car{

    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime time) {
        LocalTime tstart = LocalTime.of(06,00);
        LocalTime tstop = LocalTime.of(20,00);
        if (time.isAfter(tstart) && time.isBefore(tstop)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String getCarType() {
        return "cabrio";
    }
}
