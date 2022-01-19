package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double radius;
    private String name = "circle";
    private double field;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {

        field = Math.PI * radius * radius;
        return field;
    }
}
