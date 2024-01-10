package com.java.Day7_Jan_9_2024_ControlStatements;

public class ForLoop_InsideWhileLoop {

	public static void main(String[] args) {

		int a = 1;
		while (a == 10) { //false

			for (int j = 1; j < 9; j++) {
				System.out.println(23 + 37); //60

			}
			
			System.out.println("This is while loop body");
			
		}
		
		System.out.println("The while loop body will not be executed because condition is false in the while loop iteself");

	}

}
