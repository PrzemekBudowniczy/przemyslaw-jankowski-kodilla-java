package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;

public class ExceptionModuleRunner {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();

        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }

        FileReader fileReaderWithName = new FileReader();

        try {
            fileReaderWithName.readFile("exampleFileName.txt");
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }

        ExceptionHandling exceptionHandling = new ExceptionHandling();
        exceptionHandling.testTwoNumbersWithDefinedLogic(0, 1);


        ExceptionHandling exceptionHandlingFalse = new ExceptionHandling();
        exceptionHandlingFalse.testTwoNumbersWithDefinedLogic(1.5, 0);
    }
}
