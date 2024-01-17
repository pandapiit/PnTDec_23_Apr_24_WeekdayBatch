package com.java.Day9_Jan_16_2024_Arrays;

public class Two_Dimensional_Array {

	// []
	// [][] - 2D

	public static void main(String[] args) {

		int[][] a1;
		int a6[][];
		int a2[][];
		int[][] a3;
		int[][] a4;
		int[] a5[];

		int[][] b1, c1; // both are 2-D
		int[] b2[], c2; // b2 is 2-D, c2 is 1-D
		int[] b3[], c3[]; // both are 2-D
		int[][] b4, c4[]; // b4 is 2-D, c4 is 3-D
		int[] b5[], c5[]; // both are 2-D
		// int[][]b6, []c6; //No this is a wrong representation. Law of array in java
		// says that the 2nd variable cannot have a dimension before it.

		int[][] a = new int[3][4];
		// 3 X 4 matrix
		// 3 rows and 4 cols

		a[0][0] = 11;
		a[0][1] = 22;
		a[0][2] = 33;
		a[0][3] = 44;

		a[1][0] = 55;
		a[1][1] = 66;
		a[1][2] = 77;
		a[1][3] = 88;

		a[2][0] = 99;
		a[2][1] = 111;
		a[2][2] = 222;
		a[2][3] = 333;

		int[][] b = { { 11, 22, 33, 44 }, 
				      { 55, 66, 77, 88 }, 
				      { 99, 111, 222, 333 } };

		int[][] c = new int[][] { { 11, 22, 33, 44 }, { 55, 66, 77, 88 }, { 99, 111, 222, 333 } };

		String[][] S1 = { { "Amit", "Dear", "Lion", "Cat" }, 
				          { "Anil", "Monkey", "Panther", "Cheetah" },
				          { "Dorrethy", "Gravy", "Shirt", "Mouse" }    };

		// How to retrieve all the elements of b array ??

		for (int i = 0; i<=b.length-1; i++) {
			for (int j = 0; j<=b[i].length-1; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

	}

}
