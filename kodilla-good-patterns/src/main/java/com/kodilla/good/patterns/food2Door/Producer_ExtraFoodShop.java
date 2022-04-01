package com.kodilla.good.patterns.food2Door;

import java.util.List;

public class Producer_ExtraFoodShop implements Producer {

    @Override
    public boolean process(List<ProductWrapper> basket) {
        System.out.println("ExtraFoodShop processed, the content: " + basket.toString());
        return true;
    }
}
