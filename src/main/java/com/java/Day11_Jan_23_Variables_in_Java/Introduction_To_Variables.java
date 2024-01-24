package com.java.Day11_Jan_23_Variables_in_Java;

public class Introduction_To_Variables {
	//There are 3 types of variables in Java	
	//generally instance and static variables are also called Class Variables or Global variables 
	//but it is not wise to call them Global
	
	//1. Instance Variables
	//2. static variables
	//3. local variables
	
	
	int age = 10; //this is known as an instance variable
	static String name = "John"; //name is a static variable

	public static void main(String[] args) {
		
	}
	
	
	public static void logic1(String S1, String S2) {
		int x;
		int y;  
		//x and y are local variables. They are local only to logic1() method
		//their scope lies within the logic1() method
		//S1 and S2 are also local variables
		
		//can we make a local variable static?
		//static int z = 23; //local variables cannot be associated with static keyword
		
		//by default local variables are non-static?
		//Answer: No...Local variables are neither static nor non-static
	}

}
