package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double numberOne = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double numberTwo = scanner.nextDouble();


        Calculator calculator1 = new Calculator(numberOne, numberTwo);

        System.out.println("Result of addition = " + calculator1.addition(numberOne, numberTwo));
        System.out.println("Result of subtraction = " + calculator1.substraction(numberOne, numberTwo));
        System.out.println("Result  of multiplication = " + calculator1.multiplication(numberOne, numberTwo));
        System.out.println("Result of division = " +  calculator1.division(numberOne, numberTwo));


    }
}
