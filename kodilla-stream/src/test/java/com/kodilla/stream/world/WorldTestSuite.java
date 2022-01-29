package com.kodilla.stream.world;

import com.kodilla.stream.sand.Europe;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World theWorld = new World();
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country spain = new Country("Spain", new BigDecimal("47000000"));
        Country england = new Country("England", new BigDecimal("55000000"));
        Country usa = new Country("USA", new BigDecimal("331000000"));
        Country canada = new Country("Canada", new BigDecimal("37000000"));
        Country polandia = new Country("Polandia", new BigDecimal("984000000000000"));
        Continent europe = new Continent("Europe");
        Continent northAmerica = new Continent("North America");
        Continent utopia = new Continent("Utopia");
        europe.addCountry(poland);
        europe.addCountry(spain);
        europe.addCountry(england);
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        utopia.addCountry(polandia);
        theWorld.addContinent(europe);
        theWorld.addContinent(northAmerica);
        theWorld.addContinent(utopia);

        //When
        BigDecimal totalNumberOfPeople = theWorld.getPeopleQuantity();

        //Then
        BigDecimal expectedResult = new BigDecimal("984000508000000");
        assertEquals(expectedResult, totalNumberOfPeople);
    }
}
