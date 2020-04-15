package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable(){
        List<Flight> flights = new ArrayList <>();
        flights.add(new Flight("airport1", "airport2"));
        flights.add(new Flight("airport3", "airport4"));
        flights.add(new Flight("airport1", "airport4"));
        flights.add(new Flight("airport2", "airport3"));
        flights.add(new Flight("airport4", "airport2"));
        flights.add(new Flight("airport2", "airport1"));
        return flights;
    }
}
