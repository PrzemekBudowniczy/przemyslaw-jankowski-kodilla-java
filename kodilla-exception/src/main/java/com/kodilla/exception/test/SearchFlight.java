package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {



    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Krakow", true);
        flights.put("Warszawa", true);
        flights.put("Poznan", true);
        flights.put("Wroclaw", true);
        flights.put("Bydgoszcz", false);
        flights.put("Gdansk", false);
        flights.put("Lublin", false);
        flights.put("Lodz", false);

        String destinationAirport = flight.getArrivalAirport();
        String departureAirport = flight.getDepartureAirport();
        boolean isDestinationAirportActive = false;
        boolean isDestinationAirportExists = false;
        boolean isDepartureAirportActive = false;
        boolean isDepartureAirportExists = false;

        if(destinationAirport == departureAirport) {
            System.out.println("You can't define two the same cities.");
            return;
        }

        for (Map.Entry<String, Boolean> entry : flights.entrySet()) {
            if(isDepartureAirportExists == false && entry.getKey() == departureAirport) {
                if(entry.getValue() == true) {
                    isDepartureAirportActive = true;
                }
                isDepartureAirportExists = true;
            }
            if(isDestinationAirportExists == false && entry.getKey() == destinationAirport) {
                if(entry.getValue() == true) {
                    isDestinationAirportActive = true;
                }
                isDestinationAirportExists = true;
            }
            if(isDepartureAirportExists == true && isDestinationAirportExists == true) {break;}
        }

        if (isDepartureAirportExists == false || isDestinationAirportExists == false) {
            throw new RouteNotFoundException();
        }

        if (isDepartureAirportActive == true && isDestinationAirportActive == true) {
            System.out.println("The flight is available.");
        } else {
            System.out.println("You can't flight between these cities - one or both cities are not available for accepting airplanes departure/arrival.");
        }
    }
}
