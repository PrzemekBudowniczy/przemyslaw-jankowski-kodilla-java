package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public static List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> newList = new LinkedList<>();

        for(Integer theNumber : numbers) {
            if (theNumber % 2 == 0) {
                newList.add(theNumber);
            }
        }
        System.out.println(newList.toString());
        return newList;
    }
}
