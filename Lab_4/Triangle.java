/* -----------------------------------------------------------------------------
 *
 * File Name: Triangle.java
 * Author: Evan Nichols
 * Assignment:   EECS-168 Lab 4
 * Description:  This program will make the user guess a specific number, 73, and will
 * make user guess until the get the correct number with help statements.
 * Date: 9-22-2014
 *
 ---------------------------------------------------------------------------- */


import java.util.Scanner;

public class Triangle { public static void main (String [] args) {

	//declare scanner for user input
	Scanner myScan = new Scanner(System.in);
	
	System.out.println("Enter the number of asterisks for the base of the triangle: ");
	
	//gather user input, save as tri_base var
	
	int tri_base = myScan.nextInt();
	int j = 1;
	int k = 0;
	
	//for (i=tri_base; i > 0; i--){
		
		
		for (j=1; j<=tri_base; j++){
			
			
			for (k=0; k<j; k++) {
			
				System.out.print("*");
				}
			
			System.out.println("");
		}
}
	
}