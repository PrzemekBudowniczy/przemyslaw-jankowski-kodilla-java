package com.kodilla.good.patterns.challanges;

public interface OrderRepository {

    boolean createOrder(User user, String productCode, String productName, int quantity);
}
