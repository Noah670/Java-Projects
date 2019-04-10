
// MileConversionsInteractive.java
// Written by Noah Pohl
// Date Created, 04/09/2019

import java.util.Scanner;

public class MileConversionsInteractive {
    public static void main(String[] args) {
        System.out.println("Please enter the number of miles you wish to convert to inches, feet. yards, and kilometers");
        
        int NumberOfMiles;
        final int INCHES = 63360;
        final int FEET = 5280;
        final int YARDS = 1760;
        final double KILOMETERS = 1.609344;
        Scanner UserInput = new Scanner(System.in);
        NumberOfMiles = UserInput.nextInt();

        int milesToInches = NumberOfMiles * INCHES;
        int milesToFeet = NumberOfMiles * FEET;
        int milesToYards = NumberOfMiles * YARDS;
        double milesToKilometers = NumberOfMiles * KILOMETERS;

        System.out.println(" In " + NumberOfMiles + " miles there are " + milesToInches +" inches");
        System.out.println(" In " + NumberOfMiles + " miles there are " + milesToFeet +" feet");
        System.out.println(" In " + NumberOfMiles + " miles there are " + milesToYards + " yards");
        System.out.println(" In " + NumberOfMiles + " miles there are " + milesToKilometers + " kilometers");
    }
}