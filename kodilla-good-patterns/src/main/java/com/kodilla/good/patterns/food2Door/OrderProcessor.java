package com.kodilla.good.patterns.food2Door;

import java.text.SimpleDateFormat;
import java.util.*;

public class OrderProcessor {

    List<ProductWrapper> producer1ExtraFoodShop = new ArrayList<>();
    List<ProductWrapper> producer2GlutenFreeShop = new ArrayList<>();
    List<ProductWrapper> producer3HealthyShop = new ArrayList<>();
    //    Order theOrder;
    Producer_ExtraFoodShop producer1;
    Producer_GlutenFreeShop producer2;
    Producer_HealthyShop producer3;

    Map<Integer, List<ProductWrapper>> basketsForAllProducers = new HashMap<>();

    public OrderProcessor() {
        basketsForAllProducers = new HashMap<>();
//        theOrder = new Order(user, dateOfOrder, dateOfDelivery);
        producer1 = new Producer_ExtraFoodShop();
        producer2 = new Producer_GlutenFreeShop();
        producer3 = new Producer_HealthyShop();
    }

    public void processTheOrder(Order order) {
        splitOrderToProducers(order.getProducts());
        pushProcessJobToDomainProducer();
    }

    private void splitOrderToProducers(List<ProductWrapper> products) {
        basketsForAllProducers.put(1, producer1ExtraFoodShop);
        basketsForAllProducers.put(2, producer2GlutenFreeShop);
        basketsForAllProducers.put(3, producer3HealthyShop);
        int producerID;

        for (ProductWrapper theProductWrapper : products) {
            producerID = theProductWrapper.getProduct().producerID;
            basketsForAllProducers.get(producerID).add(theProductWrapper);
        }
    }

    private void pushProcessJobToDomainProducer() {
        if (!isEmptyBasket(1)) {
            producer1.process(producer1ExtraFoodShop);
        }
        if (!isEmptyBasket(2)) {
            producer2.process(producer2GlutenFreeShop);
        }
        if (!isEmptyBasket(3)) {
            producer3.process(producer3HealthyShop);
        }
    }

    private boolean isEmptyBasket(int producerID) {
        return basketsForAllProducers.get(producerID).isEmpty();
    }
}
