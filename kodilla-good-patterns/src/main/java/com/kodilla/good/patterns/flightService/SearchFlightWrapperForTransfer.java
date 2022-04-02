package com.kodilla.good.patterns.flightService;

public class SearchFlightWrapperForTransfer {

    Flight firstFlight;
    Flight secondFlight;

    public SearchFlightWrapperForTransfer(Flight firstFlight, Flight secondFlight) {
        this.firstFlight = firstFlight;
        this.secondFlight = secondFlight;
    }

    public Flight getFirstFlight() {
        return firstFlight;
    }

    public Flight getSecondFlight() {
        return secondFlight;
    }

    @Override
    public String toString() {
        return "SearchFlightWrapperForTransfer{" +
                "firstFlight=" + firstFlight +
                ", secondFlight=" + secondFlight +
                '}';
    }
}
