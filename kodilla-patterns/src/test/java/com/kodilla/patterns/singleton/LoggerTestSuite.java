package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void testLog() {
        //Given
        String testLog = new String("Example log for testing purposes.");
        Logger logger = Logger.INSTANCE;
        //When
        logger.log(testLog);
        //Then
        assertEquals("Example log for testing purposes.", logger.getLastLog());
    }
}
