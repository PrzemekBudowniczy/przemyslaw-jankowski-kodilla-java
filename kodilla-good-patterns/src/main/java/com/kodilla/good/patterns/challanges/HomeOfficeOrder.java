package com.kodilla.good.patterns.challanges;

public class HomeOfficeOrder implements OrderService {

    @Override
    public boolean order(User user, String productCode, String productName, int quantity) {
        System.out.println("Home office order made");
        return true;
    }
}
