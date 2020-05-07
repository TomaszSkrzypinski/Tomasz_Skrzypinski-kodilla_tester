package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car{

    boolean headlightsOn;

    public Cabrio(boolean headlightsOn) {
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
        return "cabrio";
    }
}
