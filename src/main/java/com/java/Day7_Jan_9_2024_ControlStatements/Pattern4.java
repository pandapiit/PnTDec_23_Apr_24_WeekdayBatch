package com.java.Day7_Jan_9_2024_ControlStatements;

public class Pattern4 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for (int i = 1; i <= 5; i++) {

			for (int j = 4; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}


	}

}
