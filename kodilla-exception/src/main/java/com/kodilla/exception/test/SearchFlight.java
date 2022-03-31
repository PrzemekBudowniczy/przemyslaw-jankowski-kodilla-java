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

        if(destinationAirport.equals(departureAirport)) {
            System.out.println("You can't define two the same cities.");
            return;
        }

        if(flights.containsKey(destinationAirport) && flights.containsKey(departureAirport)) {
            System.out.println("The flight is available.");
        } else {
            System.out.println("You can't flight between these cities - one or both cities are not available for accepting airplanes departure/arrival.");
            throw new RouteNotFoundException();
        }
    }
}
