package java.concepts;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the rows:");
		int row = sc.nextInt();
		System.out.println("Enter the columns:");
		int cols = sc.nextInt();

		// 2d array

		int matrix1[][] = new int[row][cols];
		int transpose[][] = new int[cols][row];

		System.out.println("please enter the matrix data:");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}

		System.out.println("print the matrix data:");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix1[i][j] +" ");
			}
			System.out.println();
		}


		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				transpose[j][i] = matrix1[i][j];
			}
		}
		
		System.out.println("print the transpose matrix data:");
		for (int r[] : transpose) {
			System.out.println(Arrays.toString(r));

		}

	}

}
