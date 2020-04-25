package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FlightFinderTestSuit {

    FlightFinder flightFinder = new FlightFinder();

    @Test
    public void checkNumberFlightsFromWarsaw() {
        List <Flight> flightsDeparture;
        flightsDeparture = flightFinder.findFlightsFrom("Warsaw");
        int result = flightsDeparture.size();
    assertEquals(3,result);
    }

    @Test
    public void checkNumberFlightsFromBerlin() {
        List <Flight> flightsDeparture;
        flightsDeparture = flightFinder.findFlightsFrom("Berlin");
        int result = flightsDeparture.size();
        assertEquals(1,result);
    }

    @Test
    public void checkNumberFlightsToWarsaw() {
        List <Flight> flightsArrival;
        flightsArrival = flightFinder.findFlightsTo("Warsaw");
        int result = flightsArrival.size();
        assertEquals(3,result);
    }

    @Test
    public void checkNumberFlightsToRoma() {
        List <Flight> flightsArrival;
        flightsArrival = flightFinder.findFlightsTo("Roma");
        int result = flightsArrival.size();
        assertEquals(1,result);
    }

    @Test
    public void checkIfFlightsFromHelsinkiAreNotAvailable() {
        List <Flight> flightsDeparture;
        flightsDeparture = flightFinder.findFlightsFrom("Helsinki");
        int result = flightsDeparture.size();
        assertEquals(0,result);
    }

    @Test
    public void checkIfFlightsToHelsinkiAreNotAvailable() {
        List <Flight> flightsArrival;
        flightsArrival = flightFinder.findFlightsTo("Helsinki");
        int result = flightsArrival.size();
        assertEquals(0,result);
    }
}
