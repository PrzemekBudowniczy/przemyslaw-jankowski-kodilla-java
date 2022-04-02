package com.kodilla.good.patterns.flightService;

import java.time.Duration;
import java.util.Objects;

public class Flight {

    String departureAirport;
    String destinationAirport;
    Duration flightDuration;

    public Flight(String departureAirport, String destinationAirport, int flightDuration) {
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.flightDuration = Duration.ofMinutes(flightDuration);
    }

    public String getConnectionName() {
        return departureAirport + "-" + destinationAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public Duration getFlightDuration() {
        return flightDuration;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureAirport='" + departureAirport + '\'' +
                ", destinationAirport='" + destinationAirport + '\'' +
                ", flightDuration=" + flightDuration +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departureAirport, flight.departureAirport) && Objects.equals(destinationAirport, flight.destinationAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureAirport);
    }
}
