package java.concepts;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows in first matrix:");
		int rowsInFirst = sc.nextInt();
		System.out.println("Enter the number of columns in first matrix or rows in second matrix :");
		int colsInFirstRowsInSecond = sc.nextInt();
		System.out.println("Enter the number of columns in second matrix:");
		int colsInSecond = sc.nextInt();

		int matrix1[][] = new int[rowsInFirst][colsInFirstRowsInSecond];
		int matrix2[][] = new int[colsInFirstRowsInSecond][colsInSecond];
		int product[][] = new int[rowsInFirst][colsInSecond];

		System.out.println("please enter the matrix1 data:");

		for (int i = 0; i < rowsInFirst; i++) {
			for (int j = 0; j < colsInFirstRowsInSecond; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("please enter the matrix2 data:");

		for (int i = 0; i < colsInFirstRowsInSecond; i++) {
			for (int j = 0; j < colsInSecond; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}

		System.out.println("print the matrix1 data:");
		for (int r[] : matrix1) {
			System.out.println(Arrays.toString(r));

		}

		System.out.println("print the matrix2 data:");
		for (int r[] : matrix2) {
			System.out.println(Arrays.toString(r));

		}

		// get the product
		for (int i = 0; i < rowsInFirst; i++) {

			for (int j = 0; j < colsInSecond; j++) {

				for (int k = 0; k < colsInFirstRowsInSecond; k++) {
					product[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		
		//print the final product
		
		System.out.println("to print the final data: ");
		
		for (int r[] : product) {
			System.out.println(Arrays.toString(r));

		}

	}

}
