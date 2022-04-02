package com.kodilla.good.patterns.flightService;

import java.util.*;

public class FlightsCatalogue {

    Map<String, Flight> flights = new HashMap<>();
    List<Flight> simpleSearchResult;
    List<SearchFlightWrapperForTransfer> searchFlightWrapperForTransfer;

    public void addFlight(String departureAirport, String destinationAirport, int flightDuration) {
        Flight flight = new Flight(departureAirport, destinationAirport, flightDuration);
        flights.put(flight.getConnectionName(), flight);
    }

    @Override
    public String toString() {
        return "FlightsCatalogue{" +
                "flights=" + flights +
                '}';
    }
}
