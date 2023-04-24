package DiagonalDiff;

import java.sql.Array;
import java.util.Scanner;

public class DiagonalDifference {
	//global scanner to use
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		//function to take input for size of matrix
		int matrixsize = lengthmatrix();
		
		int [][] matrix = new int[matrixsize][matrixsize];
		//function to take matrix input
		fillmatrix(matrix,matrixsize);
		
		//calculates the diagonal difference
		CalculateDiagonalSum(matrix, matrixsize);
		
	}
	
	//takes the length of the matrix
		private static int lengthmatrix() {
			// TODO Auto-generated method stub
			int size=0;
			System.out.println("Enter the length of the matrix");
			size = scan.nextInt();
			return size;
		}

	//takes input to fill the matrix
	private static int[][] fillmatrix(int[][] matrix, int matrixsize) {
		// TODO Auto-generated method stub
		System.out.println("Enter the numbers");
		for(int i=0; i<matrixsize;i++) {
			
			for(int j=0;j<matrixsize;j++) {
				matrix[i][j]=scan.nextInt();
			}//inner loop
		}//outer loop
		return matrix;
	}

	
	public static void CalculateDiagonalSum(int[][] matrix, int matrixsize) {
		// TODO Auto-generated method stub
		int startleft=0;
		int startright=0;
			
		for (int i=0;i<matrixsize;i++) {
			for(int j=0;j<matrixsize;j++) {
				if (i==j) {
					startleft += matrix[i][j];
				}
				if ( (i+j)== (matrixsize-1)) {
					startright += matrix[i][j];
				}
			}//inner loop
		}//outer loop
		
		int result = Math.abs(startleft-startright);
		System.out.println(result);
		
		

	}//method

}//class

