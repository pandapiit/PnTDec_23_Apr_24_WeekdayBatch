package com.java.Day21_Feb_27_Wrapper_Class;

public class Topic4_Boxing_Unboxing_Autoboxing_Autounboxing {
	
	//The parent of the below classes is Number Class
	//Integer
	// Long
	// Short
	//Double
	// Float
     //Byte
	
	//The parent class of the below mentioned classes is Object Class
	//Boolean
	//Character
	
	//What is Boxing?
	//Conversion of primitive data type to Wrapper Class Object
	
	
	//What is Unboxing?
	//Conversion of Wrapper Class object into primitive data type
	
	//Homework - try boxing, unboxing, autoboxing and autounboxing for other Wrapper Class Objects and data types
	

	public static void main(String[] args) {
		boxingExample();
		autoboxingExample();
		unboxingExample();
		autoUnboxingExample();
	
	}
	
	public static void boxingExample() {
		int a = 100; //a is primitive data type
		Integer b = Integer.valueOf(a); //b is Wrapper class Object
		System.out.println("The wrapper class object is : " + b);
	}
	

	public static void autoboxingExample() {
		int a = 100;
		Integer b = a;
		System.out.println(b);
		
	}
	
	public static void unboxingExample() {
		Integer result = 100;
		int newResult = result.intValue();
		System.out.println("The primitive data type is : " + newResult);
	}
	
	public static void autoUnboxingExample() {
		Integer result = 100;
		int newResult = result;
		System.out.println("The primitive data type is : " + newResult);
		
	}

}
