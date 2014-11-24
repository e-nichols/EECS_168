/* -----------------------------------------------------------------------------
 *
 * File Name: NumberGuessingGame.java
 * Author: Evan Nichols
 * Assignment:   EECS-168 Lab 4
 * Description:  This program will make the user guess a specific number, 73, and will
 * make user guess until the get the correct number with help statements.
 * Date: 9-22-2014
 *
 ---------------------------------------------------------------------------- */


import java.util.Scanner;

public class NumberGuessingGame { public static void main (String [] args) {


	//declare new scanner variable to get user input
	Scanner myScan = new Scanner(System.in);

	//declare answer and guess vars
	int answer = 73;
	int guess = 0;

System.out.println("Welcome to the number guessing game.");

do {
	System.out.println("Guess a number: ");
	guess = myScan.nextInt();
	
	if (guess > 73) {
		System.out.println("Sorry, your guess is too high.");
	}
	else if (guess < 73) {
		System.out.println("Sorry, your guess is too low.");
	}
	else {
		
	};
} while (guess != answer);

System.out.println("You win!");
	
}
}