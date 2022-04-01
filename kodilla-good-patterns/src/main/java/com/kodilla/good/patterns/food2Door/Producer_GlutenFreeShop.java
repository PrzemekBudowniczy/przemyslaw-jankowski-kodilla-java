package com.kodilla.good.patterns.food2Door;

import java.util.List;

public class Producer_GlutenFreeShop implements Producer {

    @Override
    public boolean process(List<ProductWrapper> basket) {
        System.out.println("GlutenFreeShop processed, the content: " + basket.toString());
        return true;
    }
}
