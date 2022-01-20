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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.length, length) != 0) return false;
        if (Double.compare(square.getField(), getField()) != 0) return false;
        return name.equals(square.name);
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
