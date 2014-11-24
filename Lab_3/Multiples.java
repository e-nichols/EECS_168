/* -----------------------------------------------------------------------------
 *
 * File Name:  Multiples.java
 * Author: Evan Nichols, evan.t.nichols@ku.edu
 * Assignment:   EECS-168/169 Lab 3
 * Description:  This program will compute a user-specified number of multiples of an integer.
 * Date: 9/17/2014 
 * 
 ---------------------------------------------------------------------------- */


//import Scanner package
import java.util.Scanner;

public class Multiples {

	public static void main(String[] args){
		
		//create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Get user input for base number and save as var
		System.out.println("What number do you wish to see multiples of?");
		int base_num = input.nextInt();
		
		//Get user input for number of multiples and save as var
		System.out.println("How many multiples?");
		int multiples = input.nextInt();
		
		//if statement to check for numbers less than or equal to zero
		if (multiples <= 0) {
			System.out.println("Error: The amount of multiples to display must be greater than zero.");
		}
		
		else {
		System.out.println("Here are the first "+multiples+" multiples of the number "+base_num+":");
		};
		
		//use for loop to calculate the first n multiples
		int i = 0;
		
		for (i=1; i<multiples+1; i++){
			System.out.println(i*base_num);
		};		
	}
}