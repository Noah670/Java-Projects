
// InchConversion.java
// Written by Noah
// Created on 04/12/2019

import java.util.Scanner;

public class InchConversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of inches you want to convert to feet and yards");
        double Feet;
        Feet = input.nextInt() / 12;
        double Yards;
        Yards = Feet * 0.333333;
        InchesTofeet(Feet);
        InchesToyards(Yards);
    }

    static void InchesTofeet(Double Feet) {
        System.out.println(Feet + " feet");
    }

    static void InchesToyards(Double Yards) {
        System.out.println(Yards + " yards");
    }
}