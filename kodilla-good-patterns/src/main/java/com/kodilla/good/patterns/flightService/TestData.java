package com.kodilla.good.patterns.flightService;

public class TestData {

    public FlightsCatalogue generateTestData() {

        FlightsCatalogue flightsCatalogue = new FlightsCatalogue();

        flightsCatalogue.addFlight("WAW", "KRK", 55);
        flightsCatalogue.addFlight("WAW", "BZG", 45);
        flightsCatalogue.addFlight("WAW", "GDN", 60);

        flightsCatalogue.addFlight("KRK", "WAW", 55);
        flightsCatalogue.addFlight("KRK", "BZG", 40);
        flightsCatalogue.addFlight("KRK", "GDN", 55);

        flightsCatalogue.addFlight("BZG", "WAW", 45);
        flightsCatalogue.addFlight("BZG", "KRK", 40);
        flightsCatalogue.addFlight("BZG", "GDN", 60);

        flightsCatalogue.addFlight("GDN", "WAW", 60);
        flightsCatalogue.addFlight("GDN", "BZG", 60);
        flightsCatalogue.addFlight("GDN", "KRK", 55);

        return flightsCatalogue;
    }
//    Flight wawKrk = new Flight("WAW", "KRK", 55);
//    Flight wawBzg = new Flight("WAW", "BZG", 45);
//    Flight wawGdn = new Flight("WAW", "GDN", 60);
//
//    Flight KrkWaw = new Flight("KRK", "WAW", 55);
//    Flight KrkBzg = new Flight("KRK", "BZG", 40);
//    Flight KrkGdn = new Flight("KRK", "GDN", 55);
//
//    Flight bzgWaw = new Flight("BZG", "WAW", 45);
//    Flight bzgKrk = new Flight("BZG", "KRK", 40);
//    Flight bzgGdn = new Flight("BZG", "GDN", 60);
//
//    Flight gdnWaw = new Flight("GDN", "WAW", 60);
//    Flight gdnBzg = new Flight("GDN", "BZG", 60);
//    Flight gdnKrk = new Flight("GDN", "KRK", 55);
}
