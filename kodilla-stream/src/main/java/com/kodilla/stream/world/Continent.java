package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String continentName;

    List<Country> theContinentCountries = new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        theContinentCountries.add(country);
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getTheContinentCountries() {
        return theContinentCountries;
    }
}
