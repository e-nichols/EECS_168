/* -----------------------------------------------------------------------------
 *
 * File Name: Lab6.java
 * Author: Evan Nichols, evan.t.nichols@ku.edu
 * Assignment:   EECS-168 Lab 6			
 * Description:  This program will allow a user to create their own integer array, and then display the
 * sum, average, max and min of the array
 * Date: 10/6/14
 *
 ---------------------------------------------------------------------------- */

//hardcoding an array -------> string[] s = {"a","b",...};
//specifying size but not filling in values ------> string[] s = new String[5];
//access second element of array ---------> System.out.println(s[1]);
//passing into a method (square bracket) --------> public static void func_name(String[] s){};


import java.util.Scanner;

public class Lab6 {

	public static void main (String[] args) {


		//declare scanner and gather user input for array size

		Scanner myScan = new Scanner(System.in);
		System.out.print("Input an array size: ");
		int array_size = myScan.nextInt();
		System.out.println("");

		//initialize counter for while loop, init user_array
		
		int i = 0;
		int[] user_array = new int[array_size];

		//while loop: based on user-specified array size, will loop through to gather array values
		
		while (i<array_size) {

			System.out.print("Input a number into your array: ");

			user_array[i] = myScan.nextInt();

			i++;

			System.out.println("");
		}

		//print out all numbers in the array with a simple for loop
		
		System.out.println("Here are all the numbers in your array: ");
		for(int j = 0; j<array_size; j++) {

			System.out.println(user_array[j]);

		}

		//Display sum of all values to user by calling the sum_array method
		
		System.out.println("The sum of all the values is: "+sum_array(user_array));

		//Display avg - use casting (to a degree) to change sum and length vars to doubles, calc average
		
		double tmp_sum = sum_array(user_array);
		double tmp_length = user_array.length;
		double avg = tmp_sum/tmp_length;

		System.out.println("The average of all the values is:"+avg);

		//display max array value
		
		System.out.println("The largest value is: "+array_max(user_array));

		//display min array value
		
		System.out.println("The smallest value is: "+array_min(user_array));

		myScan.close();


	};

	//METHODS FOR SUM, MIN AND MAX

	//sum_array method: takes one array in as input, uses for loop to cycle through 
	//and sum all elements saved as sum variable

	public static int sum_array(int[] array) {

		int sum = 0;

		int i = 0;

		for(i=0; i<array.length; i++) {

			sum = sum + array[i];

		}

		return sum;
	}

	//array_min method: takes one array as input, cycles through and compares each element to the first array element. 
	//if element is less than the first, it will be assigned to the min variable.
	//if not, counter increases and loops

	public static int array_min(int[] array) {

		int min = array[0];

		int j = 0;

		for (j = 0; j<array.length; j++) {

			if (array[j] < min) {

				min = array[j];
			}

			else {
			}
		}

		return min;
	}

	//array_max method: same as array_min except looks for elements greater than the first array element
	
	public static int array_max(int[] array) {

		int max = array[0];

		int j = 0;

		for (j = 0; j<array.length; j++) {

			if (array[j] > max) {

				max = array[j];
			}

			else {
			}
		}

		return max;
	}
}