package com.java.Day7_Jan_9_2024_ControlStatements;

public class PatternProgram3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
