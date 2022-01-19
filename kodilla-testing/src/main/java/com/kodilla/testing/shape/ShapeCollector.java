package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();
    private String collectionName;
    private String stringWithFiguresFromList;

    public ShapeCollector(String collectionName) {
        this.collectionName = collectionName;
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public String showFigures() {
        for (Shape shape : shapes) {
            stringWithFiguresFromList += shape.getShapeName();
        }
        return stringWithFiguresFromList;
    }
}
