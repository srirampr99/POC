package org.numbergame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess1 {

    public static void main(String[] args) {

          int secretNumber;

         // secretNumber = (int) (Math.random() * 99 + 1);

          Random rand = new Random();

          secretNumber = rand.nextInt(100) + 1;
          
          System.out.println("Please choose a number in mind and type in 'ready' to beign playing the guessing game...");
          		

          Scanner keyboard = new Scanner(System.in);

          int guess;

          do {

                System.out.print("Is the number " + secretNumber + " ?");

                guess = keyboard.nextInt();

               // System.out.println("Your guess is " + guess);

                if (guess == secretNumber)

                      System.out.println("Your guess is correct. Congratulations!");

                else if (guess < secretNumber)

                      System.out

                                 .println("Your guess is smaller than the secret number.");

                else if (guess > secretNumber)

                      System.out

                                 .println("Your guess is greater than the secret number.");

          } while (guess != secretNumber);

    }

}