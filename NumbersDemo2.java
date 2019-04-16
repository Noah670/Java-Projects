
// NumbersDemo2.java
// Written by Noah
// Created on 04/12/2019

import java.util.Scanner;

public class NumbersDemo2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("------------------------");
        

        int numberOne;
        numberOne = input.nextInt();
        int numberTwo;
        numberTwo = input.nextInt();
        displayTwiceTheNumber(numberOne, numberTwo);
        displayNumberPlusFive(numberOne, numberTwo);
        displayNumberSquared(numberOne, numberTwo);

    }

    static void displayTwiceTheNumber(int numberOne, int numberTwo) {
        System.out.println("Displaying twice the number");
        System.out.println(numberOne * 2);
        System.out.println(numberTwo * 2);

    }

    static void displayNumberPlusFive(int numberOne, int numberTwo) {
        System.out.println("Displaying the number plus five");
        System.out.println(numberOne + 5);
        System.out.println(numberTwo + 5);
    }

    static void displayNumberSquared(int numberOne, int numberTwo) {
        System.out.println("Displaying the number squared");
        System.out.println(numberOne * numberOne);
        System.out.println(numberTwo * numberTwo);

    }
}
