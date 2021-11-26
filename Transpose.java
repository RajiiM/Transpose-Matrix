public class Task {

	public static void main(String[] args) {
		
		int array[][] = { {1,2,3}, {4,5,6}, {7,8,9} };
		int transpose_array[][] = new int [array.length][array[0].length];
		
		transpose_array[0][0] = array[0][0];
		transpose_array[0][1] = array[1][0];
		transpose_array[0][2] = array[2][0];
		
		transpose_array[1][0] = array[0][1];
		transpose_array[1][1] = array[1][1];
		transpose_array[1][2] = array[2][1];
		
		transpose_array[2][0] = array[0][2];
		transpose_array[2][1] = array[1][2];
		transpose_array[2][2] = array[2][2];
		
//Display Array		
		System.out.println("Array values");
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + "\t");
			}
			System.out.println();
		}

//Display Transpose Array	
		System.out.println("Transpose Array");
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(transpose_array[row][col] + "\t");
			}
			System.out.println();
		}
	}
}

//Output

Array values
1	2	3	
4	5	6	
7	8	9	
Transpose Array
1	4	7	
2	5	8	
3	6	9	

------------------------------------------

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array row length");
		int row_len = sc.nextInt();
		System.out.println("Enter array column length");
		int col_len = sc.nextInt();

		int array[][] = new int[row_len][col_len];
		int transpose_array[][] = new int[array.length][array[0].length];
		
//User give input for array
		for (int row = 0; row < array.length; row++) 
		{
			System.out.println("Enter array value for row " + row);
			for (int col = 0; col < array[row].length; col++) 
			{
				array[row][col] = sc.nextInt();
			}
		}
		
//Display Array		
		System.out.println("Array values");
		for (int row = 0; row < array.length; row++) 
		{
			for (int col = 0; col < array[row].length; col++) 
			{
				System.out.print(array[row][col] + "\t");
			}
			System.out.println();
		}

//Transpose Matrix		
		for (int row = 0; row < array.length; row++) 
		{
			for (int col = 0; col < array[row].length; col++) 
			{
				transpose_array[row][col] = array[col][row];
			}
		}

//Display Transpose Array	
		System.out.println("Transpose Array");
		for (int row = 0; row < array.length; row++) 
		{
			for (int col = 0; col < array[row].length; col++) 
			{
				System.out.print(transpose_array[row][col] + "\t");
			}
			System.out.println();
		}
	}
}


//OUTPUT
Enter array row length
3
Enter array column length
3
Enter array value for row 0
1
2
3
Enter array value for row 1
4
5
6
Enter array value for row 2
7
8
9
Array values
1	2	3	
4	5	6	
7	8	9	
Transpose Array
1	4	7	
2	5	8	
3	6	9	
------------------------------------------------