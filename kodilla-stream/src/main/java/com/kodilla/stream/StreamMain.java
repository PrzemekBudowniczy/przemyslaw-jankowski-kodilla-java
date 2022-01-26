package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;
import java.util.stream.*;

import java.util.Locale;

public class StreamMain {
    public static void main(String[] args) {

        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String textToDecor = "Casual Common Text";
        System.out.println("\nString set at start: " + textToDecor);

        System.out.println("Decorating");
        poemBeautifier.beautify(textToDecor, (text) -> "ABC" + text + "ABC");
        poemBeautifier.beautify(textToDecor, (text) -> text.toUpperCase());
        poemBeautifier.beautify(textToDecor, (text) -> text.toLowerCase());
        poemBeautifier.beautify(textToDecor, (text) -> text.repeat(5));

        System.out.println("\nUsing Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
