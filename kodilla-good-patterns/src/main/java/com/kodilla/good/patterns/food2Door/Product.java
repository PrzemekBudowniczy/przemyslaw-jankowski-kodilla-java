package com.kodilla.good.patterns.food2Door;

public class Product {

    int producerID;
    String productName;
    String productID;

    public Product(int producer, String productName, String productID) {
        this.producerID = producer;
        this.productName = productName;
        this.productID = productID;
    }

    public int getProducerID() {
        return producerID;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductID() {
        return productID;
    }

    @Override
    public String toString() {
        return "Product: {" +
                "producerID=" + producerID +
                ", productName='" + productName + '\'' +
                ", productID='" + productID + '\'' +
                '}';
    }
}
