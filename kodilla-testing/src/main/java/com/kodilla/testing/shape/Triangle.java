package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double length;
    private String name = "equilateral triangle";
    private double field;

    public Triangle(double length) {
        this.length = length;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {

        field = (0.5 * length) * length;
        return field;
    }
}
