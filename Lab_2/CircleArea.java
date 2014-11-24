/*--------------------------------------------------
 * File Name: CircleArea.java
 * Author: Evan Nichols evan.t.nichols@ku.edu
 * Assignment: EECS-168/169 Lab 2
 * Description: This program will compute the area of a circle with a hard-coded radius.
 * Date: 9/8/2014
 * 
 ----------------------------------------------------*/

public class CircleArea {
	
	public static void main(String[] args)
	{
		
		//Declare the variables and constants.
		final double PI = 3.141592;
		double radius;
		double area;
		
		//Assign a radius and calculate the area of the circle.
		radius = 20.0;
		area = PI*radius*radius;
		System.out.println("The area for the circle of radius "+radius+" is "+area);
		
	}

}
