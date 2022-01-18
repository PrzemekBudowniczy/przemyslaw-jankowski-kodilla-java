package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.*;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Executing test case for collection");
    }

    @AfterEach
    public void after() {
        System.out.println("Test case for collection executed");
    }

    @DisplayName("Examine class for empty list")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> testList = new LinkedList<>();
        //When
        testList = OddNumbersExterminator.exterminate(testList);
        //Then
        Assertions.assertEquals(testList, Arrays.asList());
//        for(Integer theNumber : testList) {
//            Assertions.assertTrue(theNumber % 2 != 0);
//        }
    }

    @DisplayName("Examine class when list contain odd & even numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> testList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //When
        testList = OddNumbersExterminator.exterminate(testList);
        //Then
        Assertions.assertEquals(testList, Arrays.asList(2, 4, 6, 8, 10));
    }
}
