/* -----------------------------------------------------------------------------
 *
 * File Name: MethodPractice.java
 * Author: Evan Nichols, evan.t.nichols@ku.edu
 * Assignment:   EECS-168/169 Lab 5
 * Description:  This program will declare and run two methods, chooseGreater and printWord. chooseGreater
 * will take in two integers and return the larger of the two, while printWord will take in a user's string
 * and print it however many times they specify.
 * Date: 9/29/14
 *
 ---------------------------------------------------------------------------- */

import java.util.Scanner;

public class MethodPractice { 
	
public static void main (String[] args) {
	
	//scanner declared to gather user input
	Scanner myScan = new Scanner(System.in);
	
	System.out.println("Enter two unique integer numbers:");
	
	int num_1 = myScan.nextInt();
	int num_2 = myScan.nextInt();
	
	//run the method on the user inputted values, print result to user
	int greater_int = chooseGreater(num_1,num_2);
	System.out.println(greater_int);
	
	//gather user input for printWord method
	System.out.println("Input a string:");
	String word_to_print = myScan.next();
	
	System.out.println("How many times do you want to print in?:");
	int num_of_prints = myScan.nextInt();
	
	//run the method on the user inputted values
	printWord(word_to_print,num_of_prints);

	
};

//chooseGreater method takes in two ints, returns the larger of the two
//don't forget to add "public static" before var type

public static int chooseGreater (int a, int b) {
		
		if (a>b) {
			return (a);
		}
		else {
			return(b);
		}
		
};

//printWord method takes in a String and int, prints the string int number of times

public static void printWord(String word,int timesToPrint) {

	int counter = 0;
	
	if (timesToPrint <= 0) {
		System.out.println("");
	}
	else { 
		for (counter = 0; counter<timesToPrint; counter++) {
			System.out.println(word);
		}
	}
}
}