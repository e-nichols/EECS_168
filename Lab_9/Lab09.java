import java.util.Scanner;

public class Lab09 {

	public static void main (String[] args) {

		//declare scanner and ArrayHelper object so we can access its methods later
		Scanner myScan = new Scanner(System.in);
		ArrayHelper a = new ArrayHelper();

		System.out.print("How many rows?: ");
		int rows = myScan.nextInt();

		System.out.print("How many columns?: ");
		int columns = myScan.nextInt();


		//declare the 2D Array based on user input 
		int [][] my2DArray = new int[rows][columns];

		//populate the array using nested for loops
		for(int i = 0; i < my2DArray.length; i++) {

			for (int j = 0; j < my2DArray[i].length; j++) {

				System.out.print("Enter a value for position ("+i+","+j+"):");

				my2DArray[i][j]= myScan.nextInt();

			}
		}

		//PRINT THE 2D ARRAY
		a.print2DArray(my2DArray);

		//EACH ROW SUM & AVG
		for(int k = 0; k < my2DArray.length; k++) {
			System.out.println("row "+ k +" sum= "+a.arraySum(my2DArray[k])+", avg= "+a.arrayAvg(my2DArray[k]));
		}

		//SUM FOR THE ENTIRE ARRAY
		System.out.println("The sum for the entire array is = "+a.arraySum2D(my2DArray));

		//AVG FOR THE ENTIRE ARRAY
		System.out.println("THe average for the entire array is = "+a.arrayAvg2D(my2DArray));

		myScan.close();

	}
}
