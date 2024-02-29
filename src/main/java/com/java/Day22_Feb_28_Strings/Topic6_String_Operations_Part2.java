package com.java.Day22_Feb_28_Strings;

public class Topic6_String_Operations_Part2 {

	public static void main(String[] args) {
		//indexOf() method
		//this method is used to determine whether a given text or character is available in the String literal or not
		//if it is not available it will return -1
		
		String S1 = "We will be finishing Automation Course with Java Selenium in one month";
		
		System.out.println(S1.indexOf("with"));
		System.out.println(S1.indexOf('C'));
		System.out.println(S1.indexOf("in", 25));
		
		
		//toString() method converts the different types of literal to String literal
		
		
		

	}

}
