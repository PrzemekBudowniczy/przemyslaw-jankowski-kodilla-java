package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    public void testProbablyIWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When&Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99, 0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1000, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0, 1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 0))
        );
    }
}
