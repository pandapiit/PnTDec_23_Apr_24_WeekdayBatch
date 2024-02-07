package com.java.Day15_Feb_06_OOPs_Polymorphism;

public class Method_Overloading_Example {
	// Criteria 1 - Method name should be the same
	// Criteria 2 - Should be in the same class
	// Criteria 3 - Parameters / Arguments should be different
	
	//What is the meaning of null in java ???
	//Whenever a reference variable has not been assigned a specific value then it points to NULL
	//Please do not say NULL is Zero in java. Complely wrong answer.
	
	String Name ;
	

	public static void main(String[] args) {
		Method_Overloading_Example ref = new Method_Overloading_Example();
		ref.addition();
		ref.addition(20, 40);
		ref.addition(10, 20, 40);
		ref.addition(1, 2);
		ref.addition(11.11, 22.22);
		ref.addition(5, 1.11);
		ref.addition("Hello", "World");
		ref.addition(25, "Hello");
	}
	
	
	public void addition() {
		System.out.println(90 + 10);
	}
	
	public void addition(int a, int b) {
		int c = a+b;
		System.out.println(c);
		
	}
	
	public void addition(double a, double b) {
		double c = a + b;
		System.out.println(c);
	}
	
	public void addition(int a, double b) {
		double c = a + b;
		System.out.println(c);
	}
	
	public void addition(int c, int d, int e) {
		int f = c+d+e;
		System.out.println(f);
	}
	
	public void addition(String S1, String S2) {
		String S3 = S1+S2;
		System.out.println(S3);
	}
	
	public void addition( int a, String S2) {
		String S3 = a+S2;
		System.out.println(S3);
	}

}
