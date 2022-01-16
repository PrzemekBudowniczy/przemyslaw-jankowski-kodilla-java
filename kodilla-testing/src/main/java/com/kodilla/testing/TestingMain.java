package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        // 6.1 - user
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // 6.2 - calculator
        int a = 22;
        int b = 2000;
        Calculator calculatorTest = new Calculator(a, b);

        if (calculatorTest.add() == a + b) {
            System.out.println("test 6.2.1 OK");
        } else {
            System.out.println("Error!");
        }

        if (calculatorTest.substract() == a - b) {
            System.out.println("test 6.2.2 OK");
        } else {
            System.out.println("Error!");
        }
    }
}
