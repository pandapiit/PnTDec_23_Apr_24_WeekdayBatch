package com.java.Day22_Feb_28_Strings;

public class Topic2_Memory_Locations_In_Java {
	
	//There are 5 memory locations in java
	//1. Heap Memory
	//2. Stack Memory
	//3. PC Register
	//4. Method area
	//5. Native Method area
	
	//Strings memory allocation moved from Method Area to Heap Memory in Java version 1.7
	//String objects will be stored in a niche memory location within Heap Memory - SCP or SLP
	//SCP(String Constant Pool / String Literal Pool)

	public static void main(String[] args) {
		
		
		String S1 = new String(); //whenever we create an object using new keyword, the object gets created in Heap Memory
		//1 object is getting created - HM
		
		String S2 = new String("Python"); // "Python" is known as a Literal
		//2 objects - 1 in HM and 1 in SLP
		
		String S3 = "Selenium";
		//1 object - SLP
		
		
		
		String S11 = new String("seleniumpanda@gmail.com");//2 objects
		String S22 = "seleniumpanda@gmail.com"; //1 object 
		

	}

}
