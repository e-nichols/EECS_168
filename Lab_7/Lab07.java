/* -----------------------------------------------------------------------------
 *
 * File Name: Lab07.java
 * Author: Evan Nichols, evan.t.nichols@ku.edu
 * Assignment: EECS168 Lab 7
 * Description: Prints a user-determined array of doubles, allows for resizing and addition of 
 * new elements
 * Date: 10/20/14
 *
 ---------------------------------------------------------------------------- */


import java.util.Scanner;
import java.util.Arrays;

public class Lab07 {

	public static void main (String[] args) {

		//declare Scanner for UI
		Scanner myScan = new Scanner(System.in);

		//init arr_size var
		int arr_size = 0;

		//gathers array size from user, will not continue until inputted size > 0
		do {
			System.out.println("Input an array size: ");

			arr_size = myScan.nextInt();
		} while(arr_size <= 0);

		//creates array using UI
		double[] doub_array = new double[arr_size];

		int i;

		System.out.println("Now please enter "+arr_size+" values");

		//allows user to enter doubles for each element of array
		for(i = 0; i < doub_array.length; i++) {

			System.out.println("Input a number into your array: ");

			doub_array[i] = myScan.nextDouble();

		}

		//returns original array to user
		System.out.println("Here are all the numbers in your array:");
		printArray(doub_array);
		System.out.println("");

		int newSize = 0;

		//do while statement asks for new array size -- until the size is greater than the originally inputted size, it will keep asking the user
		do {

			System.out.println("Input a new size:");
			newSize = myScan.nextInt();

		}while (newSize <= doub_array.length);

		//runs the arrayResize function to create new Array 
		double[] new_doub_array = arrayResize(doub_array, newSize);

		//tells user how many more values they need to enter
		System.out.println("You need to add "+(newSize-doub_array.length)+" values");

		//for loop adds necessary number of elements to the new array
		for (int j = doub_array.length; j < newSize; j++) {

			System.out.println("Input a number to add to your array:");

			new_doub_array[j] = myScan.nextDouble();
		}

		//Displays new array to user
		System.out.println("Here are all the numbers in your new array:");
		printArray(new_doub_array);

		myScan.close();

	}

	//arrayResize function: takes in oldArray and a new size, creates a new array of newSize and copies all values from oldArray, 
	//leaving remaining elements empty. Returns newArray to user
	public static double[] arrayResize(double[] oldArray, int newSize) {

		double[] newArray = new double[newSize];

		int i = 0;

		for(i=0; i<oldArray.length; i++) {

			newArray[i] = oldArray[i];
		}

		return newArray;
	}

	//printArray: If array length is 0, print [], else, print the actual array
	public static void printArray(double[] array) {

		if (array.length == 0) {
			System.out.println("[]");
		}

		System.out.println(Arrays.toString(array));
	}
}



//passing by reference: copies the reference, but points to the same data, will alter the orig data.
//passing by value: makes a copy of the reference and does NOT alter the orig passed value
