package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FlightFinderTestSuit {

    FlightFinder flightFinder = new FlightFinder();

    @Test
    public void flightsFromWarsaw() {
        List <Flight> flightsDeparture;
        flightsDeparture = flightFinder.findFlightsFrom("Warsaw");
        int result = flightsDeparture.size();
    assertEquals(3,result);
    }

    @Test
    public void flightsFromBerlin() {
        List <Flight> flightsDeparture;
        flightsDeparture = flightFinder.findFlightsFrom("Berlin");
        int result = flightsDeparture.size();
        assertEquals(1,result);
    }

    @Test
    public void flightsToWarsaw() {
        List <Flight> flightsArrival;
        flightsArrival = flightFinder.findFlightsTo("Warsaw");
        int result = flightsArrival.size();
        assertEquals(3,result);
    }

    @Test
    public void flightsToRoma() {
        List <Flight> flightsArrival;
        flightsArrival = flightFinder.findFlightsTo("Roma");
        int result = flightsArrival.size();
        assertEquals(1,result);
    }

    @Test
    public void flightsFromHelsinki() {
        List <Flight> flightsDeparture;
        flightsDeparture = flightFinder.findFlightsFrom("Helsinki");
        int result = flightsDeparture.size();
        assertEquals(0,result);
    }

    @Test
    public void flightsToHelsinki() {
        List <Flight> flightsArrival;
        flightsArrival = flightFinder.findFlightsTo("Helsinki");
        int result = flightsArrival.size();
        assertEquals(0,result);
    }
}
