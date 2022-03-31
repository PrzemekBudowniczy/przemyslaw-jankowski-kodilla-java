package com.kodilla.good.patterns.challanges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("John", "Wekl", 85010100001L);

        String productCode = "U123456789";
        String productName = "USB stick";
        int quantity = 1;

        return new OrderRequest(user, productCode, productName, quantity);
    }
}
