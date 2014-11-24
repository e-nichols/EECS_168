/* -----------------------------------------------------------------------------
 *
 * File Name: MyCircle.java
 * Author: Evan Nichols, evan.t.nichols@ku.edu
 * Assignment:   EECS-168 Lab 8			
 * Description:  Creates Circle class with one property (radius) and multiple methods
 * Date: 10/27/14
 *
 ---------------------------------------------------------------------------- */

public class MyCircle
{
	//Define the constant PI and radius variables
	private final double PI = 3.141592;
	public double rad;

	//diameter method: takes the hardcoded radius and uses it to find diameter
	public double find_diam() {

		double diam;

		diam = 2*this.rad;

		return(diam);
	}

	//area method: simple PI*R*R method, returns area
	public double find_area() {

		double area;

		area = this.rad*this.rad*this.PI;

		return(area);
	}

	//circumference method: 2*PI*R, returns circumference to user
	public double circumf() {

		double circumf;

		circumf = this.PI*2*this.rad;

		return(circumf);
	}



}

//member variables (vars declared within class) allow us to encapsulate data within the class.
//member functions allow for data manipulation and interaction with user 