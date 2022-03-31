package com.kodilla.good.patterns.challanges;

public interface OrderService {

    boolean order(User user, String productCode, String productName, int quantity);
}
