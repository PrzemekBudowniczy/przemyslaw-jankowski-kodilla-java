package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private final String bunType;
    private final int numberOfBurgersInside;
    private final String sauceType;
    private List<String> ingredients = new ArrayList<>();

    public Bigmac(String bunType, int numberOfBurgersInside, String sauceType, List<String> ingredients) {
        this.bunType = bunType;
        this.numberOfBurgersInside = numberOfBurgersInside;
        this.sauceType = sauceType;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public static class BigmacBuilder {
        private String bunType;
        private int numberOfBurgersInside;
        private String sauceType;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bunType(String bunType) {
            if (bunType == "with sesame" || bunType == "without sesame") {
                this.bunType = bunType;
                return this;
            } else {
                throw new IllegalStateException("The bun must be 'with sesame' or 'without sesame'");
            }
        }

        public BigmacBuilder numberOfBurgersInside(int numberOfBurgersInside) {
            if (numberOfBurgersInside > 0) {
                this.numberOfBurgersInside = numberOfBurgersInside;
                return this;
            } else {
                throw new IllegalStateException("Number of burgers inside bigmac must be grater than zero");
            }
        }

        public BigmacBuilder sauceType(String sauceType) {
            switch (sauceType) {
                case "standard":
                case "1000 island":
                case "barbecue":
                    this.sauceType = sauceType;
                    return this;
                default:
                    throw new IllegalStateException("The sauce type must be 'standard' or '1000 island' or 'barbecue'");
            }

        }

        public BigmacBuilder ingredient(String ingredient) {
            switch (ingredient) {
                case "lettuce":
                case "onion":
                case "bacon":
                case "cucumber":
                case "chilli pepper":
                case "mushroom":
                case "prawns":
                    ingredients.add(ingredient);
                    return this;
                default:
                    throw new IllegalStateException("Ingredient must be one from: lettuce, onion, bacon, cucumber, chilli pepper, mushroom, prawns");
            }
        }

        public Bigmac build() {
            return new Bigmac(bunType, numberOfBurgersInside, sauceType, ingredients);
        }
    }

    public String getBunType() {
        return bunType;
    }

    public int getNumberOfBurgersInside() {
        return numberOfBurgersInside;
    }

    public String getSauceType() {
        return sauceType;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bunType='" + bunType + '\'' +
                ", burgers='" + numberOfBurgersInside + '\'' +
                ", sauce='" + sauceType + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
