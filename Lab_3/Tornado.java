/* -----------------------------------------------------------------------------
 *
 * File Name:  Tornado.java
 * Author: Evan Nichols, evan.t.nichols@ku.edu
 * Assignment:   EECS-168/169 Lab 3
 * Description:  This program will compute the Fujita tornado category based on a user-inputted windspeed.
 * Date: 9/17/2014 
 * 
 ---------------------------------------------------------------------------- */


//import Scanner package
import java.util.Scanner;

public class Tornado {

	public static void main(String[] args){
		
		//create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//get user input
		System.out.println("Enter the wind speed:");
		
		//invoke the methods to read inputs
		int speed = input.nextInt();
		
		int category = 0;
		
		//create if/else loop to determine windspeed
		if (speed > 318 || speed < 40){
			System.out.println("Tornado cannot be categorized on Fujita scale.");
		}
		else if (speed > 260 && speed <= 318){
			category = 5;
			System.out.println("The tornado is an F-"+category+" tornado.");

		}
		else if (speed > 205 && speed <=260){
			category = 4;
			System.out.println("The tornado is an F-"+category+" tornado.");

		}
		else if (speed > 157 && speed <=205){
			category = 3;
			System.out.println("The tornado is an F-"+category+" tornado.");

		}
		else if (speed > 112 && speed <=157){
			category = 2;
			System.out.println("The tornado is an F-"+category+" tornado.");

		}
		else if (speed > 40 && speed <=112){
			category = 1;
			System.out.println("The tornado is an F-"+category+" tornado.");

		}
		else {
			category = 0;
			System.out.println("The tornado is an F-"+category+" tornado.");
		};
		
	}
}
