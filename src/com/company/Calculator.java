package com.company;

public class Calculator {
    private double x;
    private double y;

    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double addition(double x, double y) {
        return x + y;

    }

    public double substraction(double x, double y) {
        // if (x < y) {
        //   System.out.println("Second number cannot be greater ");?????
        // }
        return x - y;
    }

    public double multiplication(double x, double y) {
        return x * y;
    }

    public double division(double x, double y) {
        if (x == 0 || y == 0) {
            System.out.println("Cannot divide zero");
            return -1;
        }
        return x / y;


    }
}
