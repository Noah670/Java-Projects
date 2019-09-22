/*
 * Problem Set 1
 *
 * File: Statistics.java
 * Author: Noah Pohl
 * Course: CS112, Boston University
 * Section: Lab Section B3
 *
 * Purpose: Template code - Alter to state the purpose of this program
 */

// The following import command is required for performing user input:
// The Scanner class is a library which provides functionality for
// reading input from the user in the Interactions Pane. Some
// libraries (such as Math) are already inported, but most (such
// as Scanner) you need to explicitly import. The import statement
// must occur before your class definition. 

import java.text.DecimalFormat;
import java.util.Scanner;

public class Statistics {

    /*
     * main method of the Statistics program which will be used as the main entry
     * point of our program and to test the methods of the class.
     */
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        System.out.println("Please enter three different integers");
        int num1 = numbers.nextInt();
        System.out.println();
        int num2 = numbers.nextInt();
        System.out.println();
        int num3 = numbers.nextInt();

        display_statistics(num1, num2, num3);

    }

    /*
     * display_statistics()
     *
     * Static method of this class which will be used to calulate and display the
     * required statistics.
     *
     * This method accepts three integer arguments as input values and uses the
     * input values to compute the statistics. This method is a void method and does
     * not return any value.
     */
    public static void display_statistics(int num1, int num2, int num3) {
        // Enter your code
        System.out.println(num1 + num2 + num3 + " Is the sum of all three numbers");// The sum of the three numbers
        int biggestNumber = 0;
        if (num1 > num2 && num1 > num3) {
            biggestNumber = num1;
            System.out.println(num1 + " " + "is the greatest number");
        } else if (num2 > num1 && num2 > num3) {
            biggestNumber = num2;
            System.out.println(num2 + " " + "is the greatest number");
        } else if (num3 > num1 && num3 > num2) {
            biggestNumber = num3;
            System.out.println(num3 + " " + "is the greatest number"); // this will find the maximum from the three
                                                                       // numbers
        }

        int smallestNumber = 0;
        if (num1 <= num2 && num1 <= num3) { // if else statement to find the smallest number and then prints out the
            // range or the distance between the maximum and the minimum value.
            smallestNumber = num1;
            int range = biggestNumber - smallestNumber;
            System.out.println("The range of the three numbers is " + range);
        } else if (num2 <= num1 && num2 <= num3) {
            smallestNumber = num2;
            int range = biggestNumber - smallestNumber;
            System.out.println("The range of the three numbers is " + range);
        } else if (num3 <= num1 && num3 <= num2) {
            smallestNumber = num3;
            int range = biggestNumber - smallestNumber;
            System.out.println("The range of the three numbers is " + range);
        }

        int mean = ((num1 + num2 + num3) / 3); // mean of the numbers
        System.out.println("The mean of the numbers is " + mean);

        // standard deviation of the three numbers
        int difference1 = num1 - mean; // every number minus the mean
        int difference2 = num2 - mean;
        int difference3 = num3 - mean;

        int difference1Squared = difference1 * difference1; // the square of each difference
        int difference2Squared = difference2 * difference2;
        int differnece3Squared = difference3 * difference3;

        int squaredDifferenceSum = difference1Squared + difference2Squared + differnece3Squared;
        double variance = squaredDifferenceSum / 3;
        double StandardDeviation = Math.sqrt(variance); // Calculates the standard deviation of the three numbers
        DecimalFormat four = new DecimalFormat("#0.0000"); // format doubles to 4 digits of percision
        System.out.println("The standard deviation of the three numbers is " + four.format(StandardDeviation));

        // print the three numbers in ascending order
        int middleNumber = (num1 + num2 + num3) - smallestNumber - biggestNumber;
        System.out.println("Integers in ascending order:" + smallestNumber + "," + middleNumber + "," + biggestNumber);

    }
}