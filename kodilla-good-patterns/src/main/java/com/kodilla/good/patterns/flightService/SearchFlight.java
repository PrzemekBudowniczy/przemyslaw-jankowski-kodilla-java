package com.kodilla.good.patterns.flightService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SearchFlight {

    List<Flight> simpleSearchResult;
    List<SearchFlightWrapperForTransfer> searchFlightWrapperForTransfer;

    public List<Flight> searchFlightFrom(FlightsCatalogue flightsCatalogue, String departureAirport) {
        simpleSearchResult = new ArrayList<>();

        for(Map.Entry<String, Flight> flight : flightsCatalogue.flights.entrySet()) {
            if(flight.getValue().getDepartureAirport().equals(departureAirport)) {
                simpleSearchResult.add(flight.getValue());
            }
        }
        return simpleSearchResult;
    }

    public List<Flight> searchFlightTo(FlightsCatalogue flightsCatalogue, String destinationAirport) {
        simpleSearchResult = new ArrayList<>();

        for(Map.Entry<String, Flight> flight : flightsCatalogue.flights.entrySet()) {
            if(flight.getValue().getDestinationAirport().equals(destinationAirport)) {
                simpleSearchResult.add(flight.getValue());
            }
        }
        return simpleSearchResult;
    }

    public List<SearchFlightWrapperForTransfer> searchFlightTransfer(FlightsCatalogue flightsCatalogue, String departureAirport, String transferAirport, String destinationAirport) {
        searchFlightWrapperForTransfer = new ArrayList<>();

        for(Map.Entry<String, Flight> flightOne : flightsCatalogue.flights.entrySet()) {
            if(flightOne.getValue().getDepartureAirport().equals(departureAirport) && flightOne.getValue().getDestinationAirport().equals(transferAirport)) {
                for(Map.Entry<String, Flight> flightTwo : flightsCatalogue.flights.entrySet()) {
                    if(flightTwo.getValue().getDepartureAirport().equals(transferAirport) && flightTwo.getValue().getDestinationAirport().equals(destinationAirport)) {
                        searchFlightWrapperForTransfer.add(new SearchFlightWrapperForTransfer(flightOne.getValue(), flightTwo.getValue()));
                    }
                }
            }
        }
        return searchFlightWrapperForTransfer;
    }
}
