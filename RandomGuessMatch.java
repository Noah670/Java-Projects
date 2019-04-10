
// RandomGuessMatch.java
// Written by Noah Pohl
// Date Created, 04/09/2019

import java.util.Scanner;

public class RandomGuessMatch {

   public static void main(String[] args) {

      System.out.println("Please guess a random number between 1 and 5");
      Scanner number = new Scanner(System.in);
      int usernumber;
      usernumber = number.nextInt();
      int MIN = 1;
      int MAX = 5;
      int random = MIN + (int) (Math.random() * MAX);

      System.out.println("You selected the number " + usernumber + " and the random number was " + random);
      boolean result = usernumber == random;
      System.out.println(" (?) Answer: " + result);

   }
}