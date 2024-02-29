package com.java.Day22_Feb_28_Strings;

public class Important_Interview_Question {

	public static void main(String[] args) {

		String S1 = new String("Java"); // 2 objects will be created

		String S2 = new String("Java"); // 1 object

		//System.out.println(S1 == S2);
		
		// == operator is used to compare references
		
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		
		String str4 = new String("World");
		String str5 = new String("World");
		
		System.out.println(str4 == str5);
		
		System.out.println(str1==str2); //true
		
		System.out.println(str1.equals(str2));
		System.out.println(str4.equals(str5));

	}

}
