package com.kodilla.testing.shape;

public class Square implements Shape {

    private double length;
    private String name = "square";
    private double field;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {

        field = length * length;
        return field;
    }
}
