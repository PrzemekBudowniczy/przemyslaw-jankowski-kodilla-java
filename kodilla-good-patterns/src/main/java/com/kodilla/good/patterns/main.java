package com.kodilla.good.patterns;

import com.kodilla.good.patterns.flightService.FlightsCatalogue;
import com.kodilla.good.patterns.flightService.SearchFlight;
import com.kodilla.good.patterns.flightService.TestData;
import com.kodilla.good.patterns.food2Door.Order;
import com.kodilla.good.patterns.food2Door.OrderProcessor;
import com.kodilla.good.patterns.food2Door.TestDataGenerator;

public class main {

    public static void main(String[] args) {

//        MovieStar movieStar = new MovieStar();
//        String movieList = movieStar.getMovies().entrySet().stream()
//                .map(e -> e.getKey() + e.getValue().toString())
//                .collect(Collectors.joining("!"));
//
//        try {
//            System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true, "UTF-8"));
//        } catch (UnsupportedEncodingException e) {
//            throw new InternalError("Machine does not support mandatory encoding UTF-8");
//        }
//
//        System.out.println(movieList);

//        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
//        OrderRequest orderRequest = orderRequestRetriever.retrieve();
//
//        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new HomeOfficeOrder(), new HomeOfficeRepository());
//        orderProcessor.process(orderRequest);

        TestDataGenerator testData = new TestDataGenerator();
        Order order = new Order(testData.getTheUser(), "2022.04.10", "2022.04.11");
        order.addProductToBasket(testData.getExtraFoodShop_product1(), 5);
        order.addProductToBasket(testData.getHealthyShop_product5(), 2);
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processTheOrder(order);

        TestData flightServiceTestData = new TestData();
        FlightsCatalogue flights = flightServiceTestData.generateTestData();
        SearchFlight searchFlight = new SearchFlight();
        System.out.println("Search from WAW airport: \n" + searchFlight.searchFlightFrom(flights, "WAW"));
        System.out.println("Search to KRK airport: \n" + searchFlight.searchFlightTo(flights, "KRK"));
        System.out.println("Search from KRK to WAW with GDN airports: \n" + searchFlight.searchFlightTransfer(flights, "KRK", "GDN", "WAW"));
    }
}