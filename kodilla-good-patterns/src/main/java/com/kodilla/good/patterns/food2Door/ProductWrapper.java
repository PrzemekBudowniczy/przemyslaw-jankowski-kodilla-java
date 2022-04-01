package com.kodilla.good.patterns.food2Door;

public class ProductWrapper {

    Product product;
    int quantity;

    public ProductWrapper(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return product + ", quantity=" + quantity + '}';
    }
}
