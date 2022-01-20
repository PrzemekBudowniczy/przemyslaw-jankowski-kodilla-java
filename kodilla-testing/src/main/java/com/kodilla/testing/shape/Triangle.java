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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.length, length) != 0) return false;
        if (Double.compare(triangle.getField(), getField()) != 0) return false;
        return name.equals(triangle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(length);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + name.hashCode();
        temp = Double.doubleToLongBits(getField());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
