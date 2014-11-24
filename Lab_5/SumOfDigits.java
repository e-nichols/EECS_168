/* -----------------------------------------------------------------------------
 *
 * File Name: SumOfDigits.java
 * Author: Evan Nichols, evan.t.nichols@ku.edu
 * Assignment:   EECS-168/169 Lab 5
 * Description:  This program will create a method, addDigits, that will add all the individual digits of
 * of a user specified integer. For example, the int 1234 would return a sum of 10.
 * Date: 9/29/14
 *
 ---------------------------------------------------------------------------- */

import java.util.Scanner;

public class SumOfDigits { 
	public static void main (String[] args) {
		int try_again = 1;

		while (try_again == 1) {

			System.out.println("Please enter a number: ");
			
			//declare scanner for user input
			Scanner myScan = new Scanner(System.in);

			int user_int = myScan.nextInt();

			//run addDigits method on user_int, return value to user
			int sum_of_digits = addDigits(user_int);

			System.out.println("The sum of the digits is: "+sum_of_digits);

			//check if user would like to run program again
			System.out.println("Want to try again? (y=1/n=0):");
			try_again = myScan.nextInt();

		}
		
		System.out.println("Thank you!");
	}

	//method addDigits will take in an int, return the sum of its digits, and 
	//return the sum to the user

	public static int addDigits(int x) {
		
		int sum = 0;

		while (x > 0) {
			

			int digit = x%10;

			sum = sum + digit;

			x = x/10;

			
		}

		return(sum);

	}
	
	

}
