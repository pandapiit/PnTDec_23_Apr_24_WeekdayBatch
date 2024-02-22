package com.java.Day20_Feb_21_OOPs_Exception_Handling;

public class Topic_8_Throw_keyword {
	
	
	public static void main(String[] args) { //main method is acting as the caller method
		divideByZero();
		
	}
	
	
	
	public static void divideByZero() {     //is the origin of the Exception
		int a=100, b=0 , c;
		c = a/b;
		System.out.println(c);
		
		throw new ArithmeticException("I am trying to handle this exception by self");

	}

}
