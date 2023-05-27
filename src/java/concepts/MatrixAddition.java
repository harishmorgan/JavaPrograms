package java.concepts;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the rows:");
		int row = sc.nextInt();
		System.out.println("Enter the columns:");
		int cols = sc.nextInt();

		// 2d array

		int matrix1[][] = new int[row][cols];
		int matrix2[][] = new int[row][cols];

		int sum[][] = new int[row][cols];
		int sub[][]= new int [row][cols];

		System.out.println("please enter the matrix1 data:");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("please enter the matrix2 data:");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
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

		System.out.println("sum of two matrices");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];

				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("substraction of two matrices");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				sub[i][j] = matrix1[i][j] - matrix2[i][j];

				System.out.print(sub[i][j] + " ");
			}
			System.out.println();
		}

	}

}
