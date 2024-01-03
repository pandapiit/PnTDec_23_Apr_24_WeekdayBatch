package com.java.Day5_Jan_2_2024_LearningBasicsOfJava;

public class Importance_Main_Method {

	//main method is the center of execution of a java program
	//main is a method in java
	// every method in java has a return type. The return type of main method in java is void.
	//main is the name of the method
	//methods have bodies which is represented in {       }
	//String[] - [] represents a dimension. So technically this is 1-D and it is an array
	//args - this is arguments
	//can replacwe [] with three dots ...
	
	
	  public static void main(String... args) { 
	   System.out.println(10 + 20);
	   test(); //this is how you call a static method inside the main method
	  
	  }
	 
	
	
	public static void test() {
		System.out.println(25 + 25);
	}

}
