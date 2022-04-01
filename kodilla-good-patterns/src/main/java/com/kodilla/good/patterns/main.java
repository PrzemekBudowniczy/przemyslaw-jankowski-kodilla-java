package com.kodilla.good.patterns;

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
    }
}