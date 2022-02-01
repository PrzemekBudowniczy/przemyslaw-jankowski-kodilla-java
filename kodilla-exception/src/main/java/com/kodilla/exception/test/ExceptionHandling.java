package com.kodilla.exception.test;

import java.awt.*;

public class ExceptionHandling {

    public void testTwoNumbersWithDefinedLogic(double x, double y) {

        SecondChallenge secondChallenge = new SecondChallenge();
        String result = "";

        try {
            result = secondChallenge.probablyIWillThrowException(x, y);
        } catch(Exception e) {
            System.out.println("There is an issue with numbers you passed - please make a change.");
        } finally {
            if (result != "") {
                System.out.println("The run is done - without issue.");
            } else {
                System.out.println("The run is done now but exception detected.");
            }
        }
    }
}
