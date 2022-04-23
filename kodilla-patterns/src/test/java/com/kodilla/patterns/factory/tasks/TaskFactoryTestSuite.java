package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.DRIVING);
        task.executeTask();
        //Then
        assertEquals(true, task.isTaskExecuted());
        assertEquals("driving", task.getTaskName());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.PAINTING);
        task.executeTask();
        //Then
        assertEquals(true, task.isTaskExecuted());
        assertEquals("painting", task.getTaskName());
    }

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.SHOPPING);
        task.executeTask();
        //Then
        assertEquals(true, task.isTaskExecuted());
        assertEquals("shopping", task.getTaskName());
    }
}
