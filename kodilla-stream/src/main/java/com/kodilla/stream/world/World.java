package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private final String worldName = "Planet Earth";

    List<Continent> theWorldContinents = new ArrayList<>();

    public BigDecimal getPeopleQuantity() {
        //flatMap & reduce
        BigDecimal finalPeopleQuantity = BigDecimal.ZERO;
        finalPeopleQuantity = theWorldContinents.stream()
                .flatMap(country -> country.getTheContinentCountries().stream())
                .map(peopleQuantity -> peopleQuantity.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, peopleInCountry) -> sum = sum.add(peopleInCountry));

        return finalPeopleQuantity;
    }

    public void addContinent(Continent continent) {
        theWorldContinents.add(continent);
    }

    public String getWorldName() {
        return worldName;
    }

    public List<Continent> getTheWorldContinents() {
        return theWorldContinents;
    }
}
