package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigMacNewFullVersion() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bunType("with sesame")
                .numberOfBurgersInside(2)
                .sauceType("standard")
                .ingredient("lettuce")
                .ingredient("onion")
                .ingredient("bacon")
                .ingredient("cucumber")
                .ingredient("chilli pepper")
                .ingredient("mushroom")
                .ingredient("prawns")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIntegredients = bigmac.getIngredients().size();
        //Then
        assertEquals(7, howManyIntegredients);
        assertEquals("with sesame", bigmac.getBunType());
        assertEquals(2, bigmac.getNumberOfBurgersInside());
    }

    @Test
    void testBigMacNewWithSelectedIngredients() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bunType("without sesame")
                .numberOfBurgersInside(3)
                .sauceType("standard")
                .ingredient("onion")
                .ingredient("bacon")
                .ingredient("chilli pepper")
                .ingredient("mushroom")
                .ingredient("prawns")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIntegredients = bigmac.getIngredients().size();
        //Then
        assertEquals(5, howManyIntegredients);
        assertEquals("without sesame", bigmac.getBunType());
        assertEquals(3, bigmac.getNumberOfBurgersInside());
    }
}
