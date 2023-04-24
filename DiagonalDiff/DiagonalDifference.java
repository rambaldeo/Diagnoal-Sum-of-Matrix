package DiagonalDiff;

import java.sql.Array;
import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("How big is the matrix?");
		int numberofsquares = scan.nextInt();
		int [][] matrix = new int[numberofsquares][numberofsquares];
		System.out.println("Enter the numbers");
		for(int i=0; i<numberofsquares;i++) {
			
			for(int j=0;j<numberofsquares;j++) {
				matrix[i][j]=scan.nextInt();
			}//inner loop
		}//outer loop
		CalculateDiagonalSum(matrix, numberofsquares);
		
	}

	public static void CalculateDiagonalSum(int[][] matrix, int numberofsquares) {
		// TODO Auto-generated method stub
		int startleft=0;
		int startright=0;
		
		for (int i=0;i<numberofsquares;i++) {
			for(int j=0;j<numberofsquares;j++) {
				if (i==j)
					startleft += matrix[i][j];
				if ( (i+j)== (numberofsquares-1))
					startright += matrix[i][j];
			}
		}//outer loop
		
		
		System.out.println(startleft);
		System.out.println(startright);
		int result = Math.abs(startleft-startright);
		System.out.println(result);
	}//method

}//class

