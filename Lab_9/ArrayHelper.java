public class ArrayHelper {


	//THIS METHOD WORKS FOR PRINTING ARRAYS
	public void print2DArray(int[][] array) {

		System.out.println("Here is your array:");

		for(int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				if (j < (array[i].length-1)) {
					System.out.print(array[i][j]+", ");
				}
				else {
					System.out.println(array[i][j]);
				}
			}
		}
	}

	//THIS METHOD WORKS FOR SUMMING 1D ARRAYS
	public int arraySum(int[] array) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {	
			sum += array[i];
		}
		return(sum);
	}

	//THIS METHOD WORKS FOR AVERAGING 1D ARRAYS
	public double arrayAvg(int[] array) {

		double sum = arraySum(array);

		double avg = sum/array.length;
		return(avg);
	}

	//THIS METHOD WORKS FOR SUMMING 2D ARRAYS
	public int arraySum2D(int[][] array){
		int totalArraySum = 0;

		for(int i = 0; i < array.length; i++) {

			totalArraySum = totalArraySum + arraySum(array[i]);	
		}
		return(totalArraySum);	
	}

	//THIS METHOD WORKS FOR AVERAGING 2D ARRAYS
	public double arrayAvg2D(int[][] array) {

		double totalArraySum = 0;

		for(int i = 0; i < array.length; i++) {

			totalArraySum = totalArraySum + arraySum(array[i]);	
		}

		double arrayAvg = totalArraySum/((double)array.length*array[0].length);

		return(arrayAvg);

	}
}
