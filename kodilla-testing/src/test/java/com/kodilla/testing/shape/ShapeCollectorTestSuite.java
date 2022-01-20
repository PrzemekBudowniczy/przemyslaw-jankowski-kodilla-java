package com.kodilla.testing.shape;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ExceptionUtils;

import java.rmi.UnexpectedException;

@DisplayName("TDD: Shape Test Suite")
public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Test on changing the collection")
    class TestChangingCollection {
        @Test
        void testAddSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector("Test Collection");
            Shape theShape = new Square(10);
            //When
            shapeCollector.addFigure(theShape);
            //Then
            assertEquals(theShape, shapeCollector.getFigure(0));
        }

        @Test
        void testAddCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector("Test Collection");
            Shape theShape = new Circle(10);
            //When
            shapeCollector.addFigure(theShape);
            //Then
            assertEquals(theShape, shapeCollector.getFigure(0));
        }

        @Test
        void testAddTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector("Test Collection");
            Shape theShape = new Triangle(10);
            //When
            shapeCollector.addFigure(theShape);
            //Then
            assertEquals(theShape, shapeCollector.getFigure(0));
        }

        @Test
        void testRemoveShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector("Test Collection");
            Shape theShape = new Triangle(10);
            shapeCollector.addFigure(theShape);
            //When
            boolean result = shapeCollector.removeFigure(theShape);
            //Then
            assertTrue(result);
            assertNull(shapeCollector.showFigures());
        }

        @Test
        void testRemoveShapeNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector("Test Collection");
            Shape theShape = new Triangle(10);
            //When
            boolean result = shapeCollector.removeFigure(theShape);
            //Then
            assertFalse(result);
        }
    }

    @Nested
    @DisplayName("Test on reading the collection")
    class TestReadingCollection {

        @Test
        void testGetFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector("Test Collection");
            Shape theShape = new Triangle(10);
            shapeCollector.addFigure(theShape);
            //When
            Shape retrievedShape = shapeCollector.getFigure(0);
            //Then
            assertEquals(theShape, retrievedShape);
        }

        @Test
        void testGetFiguresAboveRageOfListIndex() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector("Test Collection");
            Shape theShape = new Triangle(10);
            shapeCollector.addFigure(theShape);
            //When
            Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> shapeCollector.getFigure(1));
            // Then
            assertEquals("Index 1 out of bounds for length 1", exception.getMessage());
        }

        @Test
        void testGetFiguresWithNegativeIndex() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector("Test Collection");
            Shape theShape = new Triangle(10);
            shapeCollector.addFigure(theShape);
            //When
            Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> shapeCollector.getFigure(-2));
            // Then
            assertEquals("Index -2 out of bounds for length 1", exception.getMessage());
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector("Test Collection");
            Shape theTriangle = new Triangle(10);
            Shape theSquare = new Triangle(10);
            Shape theCircle = new Triangle(10);
            shapeCollector.addFigure(theTriangle);
            shapeCollector.addFigure(theSquare);
            shapeCollector.addFigure(theCircle);
            //When
            String retrievedShapes = shapeCollector.getFigure(0).getShapeName() + shapeCollector.getFigure(1).getShapeName() + shapeCollector.getFigure(2).getShapeName();
            String createdShapes = theTriangle.getShapeName() + theSquare.getShapeName() + theCircle.getShapeName();
            //Then
            assertEquals(createdShapes, retrievedShapes);
        }

        @Test
        void readFieldTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector("Test Collection");
            Shape theShape = new Triangle(10);
            shapeCollector.addFigure(theShape);
            //When
            double retrievedShape = shapeCollector.getFigure(0).getField();
            double triangleField = theShape.getField();
            //Then
            assertEquals(triangleField, retrievedShape);
        }

        @Test
        void readFieldCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector("Test Collection");
            Shape theShape = new Circle(10);
            shapeCollector.addFigure(theShape);
            //When
            double retrievedShape = shapeCollector.getFigure(0).getField();
            double triangleField = theShape.getField();
            //Then
            assertEquals(triangleField, retrievedShape);
        }

        @Test
        void readFieldSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector("Test Collection");
            Shape theShape = new Square(10);
            shapeCollector.addFigure(theShape);
            //When
            double retrievedShape = shapeCollector.getFigure(0).getField();
            double triangleField = theShape.getField();
            //Then
            assertEquals(triangleField, retrievedShape);
        }
    }
}