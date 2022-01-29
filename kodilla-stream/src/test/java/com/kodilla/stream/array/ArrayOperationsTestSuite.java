package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] testNumbers = {5, 10, 15, 25, 100, 10000, 3};

        //When
        double average = ArrayOperations.getAverage(testNumbers);

        //Then
        assertEquals(1451.143, average, 0.001);
    }
}
