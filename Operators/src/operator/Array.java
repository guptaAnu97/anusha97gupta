package operator;

public class Array {

	public static void main(String[] args) {
		// To print the array in reverse order 
		/**
		 * int[] myintarray = { 1, 2, 3, 4, 5 };
		 * //System.out.println(myintarray.length); int i = myintarray.length -1;
		 * while(i>=0) { System.out.print(" " + myintarray[i] ); i--; }
		 */
// To find sum of the arrays
		/**
		int[][] myintarray = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		int SUM = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				// System.out.print(myintarray[i][j] +"");
				SUM = myintarray[i][j] + SUM;
			}
		}
		System.out.println("The sum of the array is :" + SUM);
*/
		// To clone the array
		/**
		int[][] myintarray = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		int[][] myarry = myintarray.clone();
		for (int i = 0; i < myarry.length; i++) {
			for (int j = 0; j < myarry.length; j++) {
				System.out.print(myarry[i][j] + " ");
			}
			System.out.println(" ");
		}
		*/
		// For loop in the array
		int[] myintarray = { 1, 2, 3, 4, 5 };
		for(int element : myintarray)
		{
			System.out.println(element);
		}
	}
}
