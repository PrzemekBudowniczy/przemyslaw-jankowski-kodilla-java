package com.kodilla.testing.calculator;

public class Calculator {
    int a;
    int b;
    int result;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        result = a + b;
        return result;
    }

    public int substract() {
        result = a - b;
        return result;
    }
}
