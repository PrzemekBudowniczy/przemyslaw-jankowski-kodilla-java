package com.kodilla.good.patterns.challanges;

public class HomeOfficeRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, String productCode, String productName, int quantity) {
        System.out.println("Home office repository - record made");
        return true;
    }
}
