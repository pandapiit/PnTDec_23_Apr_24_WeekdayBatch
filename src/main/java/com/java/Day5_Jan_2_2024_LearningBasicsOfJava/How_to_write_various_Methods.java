package com.java.Day5_Jan_2_2024_LearningBasicsOfJava;

public class How_to_write_various_Methods {
	
	public static void main(String[] args) {
		sum(); 
		multiply(); 
		subtraction();
		concatenationOfString();
	}
	
	
	public static void sum() {
		int a = 10;
		int b = 20;
		char c = 'a';
		System.out.println(a + b);
		
	}
	
	
	public static void multiply() {
		int a = 10;
		int b = 20;
		System.out.println(a * b);
	}
	
	
	public static void subtraction() {
		int a = 10;
		int b = 20;
		System.out.println(a - b);
	}
	
	public static void concatenationOfString() {
		String S1 = "Hello";
		String S2 = "World";
		System.out.println(S1 + S2);
	}

}
