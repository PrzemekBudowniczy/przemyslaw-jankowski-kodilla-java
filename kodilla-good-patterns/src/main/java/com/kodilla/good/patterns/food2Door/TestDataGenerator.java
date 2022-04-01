package com.kodilla.good.patterns.food2Door;

public class TestDataGenerator {

    User theUser;
    Product extraFoodShop_product1;
    Product extraFoodShop_product2;
    Product GlutenFreeShop_product3;
    Product GlutenFreeShop_product4;
    Product HealthyShop_product5;
    Product HealthyShop_product6;

    public TestDataGenerator() {
        extraFoodShop_product1 = new Product(1, "product 1", "U123456789");
        extraFoodShop_product2 = new Product(1, "product 2", "U223456789");
        GlutenFreeShop_product3 = new Product(2, "product 3", "U323456789");
        GlutenFreeShop_product4 = new Product(2, "product 4", "U423456789");
        HealthyShop_product5 = new Product(3, "product 5", "U523456789");
        HealthyShop_product6 = new Product(3, "product 6", "U623456789");
        theUser = new User("John", "Smith", 85010100001L);
    }

    public User getTheUser() {
        return theUser;
    }

    public Product getExtraFoodShop_product1() {
        return extraFoodShop_product1;
    }

    public Product getExtraFoodShop_product2() {
        return extraFoodShop_product2;
    }

    public Product getGlutenFreeShop_product3() {
        return GlutenFreeShop_product3;
    }

    public Product getGlutenFreeShop_product4() {
        return GlutenFreeShop_product4;
    }

    public Product getHealthyShop_product5() {
        return HealthyShop_product5;
    }

    public Product getHealthyShop_product6() {
        return HealthyShop_product6;
    }
}
