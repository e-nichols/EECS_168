/*--------------------------------------------------
 * File Name: ConvertTemperature
 * Author: Evan Nichols evan.t.nichols@ku.edu
 * Assignment: EECS-168/169 Lab 2
 * Description: This program will convert the input temperature from Fahrenheit to Celsius.
 * Date: 9/8/2014
 * 
 ----------------------------------------------------*/

//import Scanner util
import java.util.Scanner;


public class ConvertTemperature {
	
	public static void main(String[] args){
	
	//create new Scanner to accept input
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a Fahrenheit temperature:");
	double fahr = input.nextDouble();
	
	//declare and calculate celsius temperature
	double cels = (fahr - 32)*(5.0/9.0);
	
	//display converted temp to user
	System.out.println(fahr+" degrees Fahrenheit = "+cels+" degrees Celsius.");
	
}
}