package com.java.Day5_Jan_2_2024_ControlStatements;

public class Control_Statements {
	
	//There are 3 types of control statements in java
	
	//1. Selection or Conditional Statement
	//Examples - if, if else, if else if, nested if, switch
	
	//2. Iteration or Looping Statement
	//Example - while, for, for each (advanced for loop), do while
	
	//3. Jump Statement
	//Example - break, continue, return
	
	public static void main(String[] args) {
		//learningifstatement();
		greatestOf3Numbers();
		smallestOf4Numbers();
		determineLeapYear();
		checkingWithStrings();
	}
	
	public static void learningifstatement() {
		//syntax
		//application of the syntax
		//sense of the logic
		
		if(2 == 3) {
			System.out.println("The if condition is true");
		}else {
			System.out.println("The if condition was stupid");
		}
	}
	
	//there are three numbers 21, 31, 41. How will you determine using if else logic to prove 41 is the greatest??
	
	public static void greatestOf3Numbers() {
		int a = 21;
		int b = 31;
		int c = 41;
		
		if(a>b && a>c) {
			System.out.println("a is the greatest : " + a);
		}else if(b>a && b>c) {
			System.out.println("b is the greatest : " + b);
		}else {
			System.out.println("c is the greatest : " + c);
		}
	}
	
	public static void smallestOf4Numbers() {
		int a = 11;
		int b = 21;
		int c = 31;
		int d = 41;
		
		if(a<b && a<c && a<d) {
			System.out.println("a is the smallest : " + a);
		}else if(b<a && b<c && b<d) {
			System.out.println("b is the smallest : " + b);
		}else if(c<a && c<b && c<d) {
			System.out.println("c is the smallest : " + c);
		}else {
			System.out.println("d is the smallest : " + d);
		}
	}
	
	public static void determineLeapYear() {
		int year1 = 1997;
		int year2 = 2002;
		int year3 = 2004;
		int year4 = 1700;
		
		//divided by 4
		
		if(year3 % 4 == 0) {
			System.out.println("year3 is a leap year");
		}else {
			System.out.println("year3 is not a leap year");
		}
	}
	
	
	public static void checkingWithStrings() {
		String S1 = "Hello";
		String S2 = "World";
		
		
		
		String S3 = "Hello";
		String S4 = "Java";
		
		//compare the different strings using if else 
		if(S1 != S2) {
			System.out.println("both strings are not equal");
		}else {
			System.out.println("strings are equal");
		}
	}
	
	
	

}
