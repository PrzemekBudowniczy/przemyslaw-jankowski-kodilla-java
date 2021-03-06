package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("driving", "to home", "car");
            case PAINTING:
                return new PaintingTask("painting", "white", "kitchen");
            case SHOPPING:
                return new ShoppingTask("shopping", "bread", 1);
            default:
                return null;
        }
    }
}
