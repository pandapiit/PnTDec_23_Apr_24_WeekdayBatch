package com.java.Day7_Jan_9_2024_ControlStatements;

public class Nested_for_loop {
	// for 1 execution of outer loop - inner loop executes completely

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			System.out.println("outer for loop is : " + i);

			for (int j = 1; j <= 5; j++) {
				System.out.println("The value of inner for loop is : " + j);

			}

		}

	}

}
