package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    double result;

    @Autowired
    private Calculator calculator;

    @Test
    void testAdd() {
        //Given
        //When
        result = calculator.add(5, 3);
        //Then
        Assertions.assertEquals(result, 8);
    }

    @Test
    void testSub() {
        //Given
        //When
        result = calculator.sub(5, 3);
        //Then
        Assertions.assertEquals(result, 2);
    }

    @Test
    void testMul() {
        //Given
        //When
        result = calculator.mul(5, 3);
        //Then
        Assertions.assertEquals(result, 15);
    }

    @Test
    void testDiv() {
        //Given
        //When
        result = calculator.div(5, 2.5);
        //Then
        Assertions.assertEquals(result, 2);
    }
}
