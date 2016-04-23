package org.numbergame;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame1 {
	
	public void guessNumber(){
		Random generator = new Random();
	    Scanner reader = new Scanner(System.in);

	    String higher = "higher", lower = "lower", input;
	    int random, lowerBound = 1, upperBound = 100, randomLast;

	    random = generator.nextInt(100) + 1;
	    
	    int initialGuess = random;
	    randomLast = random;
	    System.out.println("Is the number " + initialGuess +" ?");
	    System.out.println("Input if number should be higher, lower, yes, or end: ");
	    input = reader.next();

	   
		    while (!(input.equals("yes") || input.equals("end"))){
		        if (input.equals("lower")){
		           randomLast = lowerBound;
		           lowerBound = generator.nextInt(random) + 1;
		        	
		        	
		            if ((lowerBound < random) && (lowerBound < randomLast) ){
		            	System.out.println("lowerBound while :"+lowerBound);
		            random = lowerBound;
		        	
		        	
		            System.out.println("Is the number " + random +" ?");
		          
		            	System.out.println("Input if number should be 'higher', 'lower', 'yes', or end: ");
		                input = reader.next();
		            } else {
		                input = lower;
		            }
		        } else if (input.equals("higher")){
		            randomLast = random;
		            upperBound = (int)(Math.random() * (101 - randomLast) + randomLast);//generator.nextInt(6000)+1;
		            System.out.println("upperBound  :"+upperBound);
		            if ((upperBound > random) && (upperBound > randomLast) || upperBound == 100){
		            random = upperBound;
		            System.out.println("Is the number " + random +" ?");
		            if(upperBound == 100){
		            	System.out.println("100 is the highest number to guess, please enter lower value or end the game!");
		            }else{
		            	System.out.println("Input if number should be higher, lower, yes, or end: ");
		            }
		            
		            input = reader.next();
		            } else {
		                input = higher;
		            }
		        }
		    }
		    
		    if (input.equals("yes") || input.equals("end")){
		    	System.out.println("Thank you for playing number guessing game, have a nice day!");
		    }
	}

public static void main(String[] args) {

	NumberGuessGame1 numberGuessGame1 = new NumberGuessGame1();
	numberGuessGame1.guessNumber();
    }
}