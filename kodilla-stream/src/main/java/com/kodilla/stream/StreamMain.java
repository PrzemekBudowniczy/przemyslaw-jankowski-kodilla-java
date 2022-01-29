package com.kodilla.stream;

//import com.kodilla.stream.beautifier.PoemBeautifier;
//import com.kodilla.stream.beautifier.PoemDecorator;
//import com.kodilla.stream.iterate.NumbersGenerator;
//import com.kodilla.stream.lambda.ExpressionExecutor;
//import com.kodilla.stream.lambda.Processor;
//import com.kodilla.stream.reference.FunctionalCalculator;
//import java.util.stream.*;
//import java.util.Locale;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultForumUsers = theForum.getUserList().stream()
                .filter(gender -> gender.getGender() == 'M')
                .filter(age -> (ChronoUnit.YEARS.between(age.getDateOfBirth(), LocalDate.now()) >= 20))
                .filter(posts -> posts.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        System.out.println(theResultForumUsers.values());

//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));
//
//        System.out.println(theResultStringOfBooks);

//        BookDirectory theBookDirectory = new BookDirectory();
//        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toList());
//
//        System.out.println("# elements: " + theResultListOfBooks.size());
//        theResultListOfBooks.stream()
//                .forEach(System.out::println);

//        BookDirectory theBookDirectory = new BookDirectory();
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(b -> b.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, b -> b));
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);


//        People.getList().stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
//                .filter(s -> s.substring(0, 1).equals("M"))
//                .forEach(System.out::println);


//        Processor processor = new Processor();
//        processor.execute(() -> System.out.println("This is an example text."));
//
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
//
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        String textToDecor = "Casual Common Text";
//        System.out.println("\nString set at start: " + textToDecor);
//
//        System.out.println("Decorating");
//        poemBeautifier.beautify(textToDecor, (text) -> "ABC" + text + "ABC");
//        poemBeautifier.beautify(textToDecor, (text) -> text.toUpperCase());
//        poemBeautifier.beautify(textToDecor, (text) -> text.toLowerCase());
//        poemBeautifier.beautify(textToDecor, (text) -> text.repeat(5));
//
//        System.out.println("\nUsing Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);
    }
}
