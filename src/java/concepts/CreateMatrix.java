package java.concepts;

import java.util.Arrays;
import java.util.Scanner;

public class CreateMatrix {

	public static void main(String[] args) {

		// Create Matrix In Java || How to iterate a Matrix [2D Array]

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total rows: ");
		int row = sc.nextInt();

		System.out.println("Enter total columns: ");

		int column = sc.nextInt();

		// 2d array

		int data[][] = new int[row][column];

		System.out.println("please enter the matrix data:");

		// To fill the data
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {

				data[i][j] = sc.nextInt();

			}
		}

		// 1.

		// To get the data
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(data[i][j] + " ");

			}

			System.out.println();

		}

		// 2.

		for (int r[] : data) {
			for (int x : r) {
				System.out.print(x + " ");
			}
			System.out.println();
		}

		// 3.

		for (int r[] : data) {
			System.out.println(Arrays.toString(r));

		}
		// 4.
		System.out.println(Arrays.deepToString(data));

		// 5.
		Arrays.stream(data).forEach((e) -> {
			Arrays.stream(e).forEach((j) -> System.out.print(j + " "));
			System.out.println();
		}

		);

	}
}
