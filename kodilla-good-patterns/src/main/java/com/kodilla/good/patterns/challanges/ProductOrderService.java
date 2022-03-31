package com.kodilla.good.patterns.challanges;

public class ProductOrderService {

    public boolean order(final User user, final String productCode, final String productName, final int quantity) {
        System.out.println("Order made by: " + user.getFirstName() + user.getSurname()
                + " for product: " + productCode.toString() + " " + productName.toString() + " quantity: " + quantity);

        return true;
    }
}
