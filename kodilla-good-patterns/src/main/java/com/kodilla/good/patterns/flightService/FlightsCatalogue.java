package com.kodilla.good.patterns.flightService;

import java.util.*;

public class FlightsCatalogue {

    private Map<String, Flight> flights = new HashMap<>();

    public void addFlight(String departureAirport, String destinationAirport, int flightDuration) {
        Flight flight = new Flight(departureAirport, destinationAirport, flightDuration);
        flights.put(flight.getConnectionName(), flight);
    }

    public Map<String, Flight> getFlights() {
        return flights;
    }

    @Override
    public String toString() {
        return "FlightsCatalogue{" +
                "flights=" + flights +
                '}';
    }
}
