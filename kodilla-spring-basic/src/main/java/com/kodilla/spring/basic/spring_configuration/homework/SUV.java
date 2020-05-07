package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car{

    boolean headlightsOn;

    public SUV(boolean headlightsOn) {
        this.headlightsOn = headlightsOn;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        if (headlightsOn) {
            return true;
        } return false;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
