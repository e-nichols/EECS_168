/*--------------------------------------------------
 * File Name: ComputeCircleArea
 * Author: Evan Nichols evan.t.nichols@ku.edu
 * Assignment: EECS-168/169 Lab 2
 * Description: This program will compute the area of a circle with a hard-coded radius.
 * Date: 9/8/2014
 * 
 ----------------------------------------------------*/

//import Scanner package.
import java.util.Scanner;

public class ComputeCircleArea {
	
	public static void main(String[] args)
	{
		
		//Declare the variables and constants.
		final double PI = 3.141592;
		double radius;
		double area;
		
		//Read the input from the keyboard.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number for the radius:");
		radius = input.nextDouble();
		
		//calculates area based on input
		area = PI*radius*radius;
		System.out.println("The area for the circle of radius "+ radius +" is "+area);
		
	}

}