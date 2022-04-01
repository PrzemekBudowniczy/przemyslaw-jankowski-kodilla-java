package com.kodilla.good.patterns.food2Door;

import java.util.List;

public interface Producer {

    boolean process(List<ProductWrapper> basket);
}
