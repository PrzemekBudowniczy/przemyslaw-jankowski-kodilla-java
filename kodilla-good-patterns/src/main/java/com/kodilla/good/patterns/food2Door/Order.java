package com.kodilla.good.patterns.food2Door;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private User user;
    private LocalDate dateOfOrder;
    private LocalDate dateForDelivery;
    private List<ProductWrapper> products = new ArrayList<>();

    public Order(User user, LocalDate dateOfOrder, LocalDate dateForDelivery) {
        this.user = user;
        try {
            this.dateOfOrder = dateOfOrder;
            this.dateForDelivery = dateForDelivery;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public void addProductToBasket(Product product, int quantity) {
        products.add(new ProductWrapper(product, quantity));
    }

    public void modifyProductFromBasket(int positionInBasket, int quantity) {
        if (quantity == 0) {
            deleteProductFromBasket(positionInBasket);
        } else {
            products.get(positionInBasket).setQuantity(quantity);
        }
    }

    public void deleteProductFromBasket(int positionInBasket) {
        products.remove(positionInBasket);
    }

    public List<ProductWrapper> getProducts() {
        return products;
    }
}
