package com.kodilla.good.patterns.challanges;

public class OrderRequest {

    private User user;
    private String productCode;
    private String productName;
    private int quantity;

    public OrderRequest(User user, String productCode, String productName, int quantity) {
        this.user = user;
        this.productCode = productCode;
        this.productName = productName;
        this.quantity = quantity;
    }

    public User getUser() { return user; }

    public String getProductCode() { return productCode; }

    public String getProductName() { return productName; }

    public int getQuantity() { return quantity; }
}
