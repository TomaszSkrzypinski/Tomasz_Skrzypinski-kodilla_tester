package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightFinder extends FlightRepository {

    FlightFinder flightFinder;
    public FlightFinder getFlightFinder() {
        return flightFinder;
    }

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightsFrom("Warsaw");
        System.out.println("Flights from " + flightFinder.findFlightsFrom("Berlin"));
        System.out.println("Flights to " + flightFinder.findFlightsTo("Roma"));
    }

    public List<Flight> findFlightsFrom(String departure){
        List<Flight> flightsDeparture = new ArrayList <>();
        List<Flight> flights = flightFinder.getFlightsTable();
        for (Flight flight : flights)
            if(departure.equals(flight.getDeparture()) )
                flightsDeparture.add(flight);
            return flightsDeparture;
    }

   public List <Flight> findFlightsTo(String arrival){
       List<Flight> flightsArrival = new ArrayList <>();
       List<Flight> flights = flightFinder.getFlightsTable();
       for (Flight flight : flights)
           if(arrival.equals(flight.getArrival()) )
               flightsArrival.add(flight);
        return flightsArrival;
        }
   }