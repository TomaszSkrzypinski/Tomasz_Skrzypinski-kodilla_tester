package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Sedan implements Car{

    boolean headlightsOn;

    public Sedan(boolean headlightsOn) {
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
        return "sedan";
    }
}
