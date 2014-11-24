/* -----------------------------------------------------------------------------
 *
 * File Name: SummationOfFives.java
 * Author: Evan Nichols
 * Assignment:   EECS-168 Lab 4
 * Description:  This program will compute the sum of multiples of five that are
 * greater than 1 using a while loop.
 * Date: 9-22-2014
 *
 ---------------------------------------------------------------------------- */


import java.util.Scanner;

public class SummationOfFives { public static void main (String [] args) {
	
	// declare scanner for user input
	
	Scanner myScan = new Scanner(System.in);
	
	System.out.println("Please input a positive integer as the end value: ");
	
	//gather integer input from user, initialize summation variable
	int end_val = myScan.nextInt();
	
	int summation = 0;
	int multiple = 0;
	
	//while loop to increase summation until it reaches end_val
	
	while (multiple <= end_val) {
		
		summation = summation + multiple;
		multiple = multiple+5;
		
	};
	
	//display final summation to user
	System.out.println("The summation is: "+summation);
	
	myScan.close();
		
	//end program*/
}
}
