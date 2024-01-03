package com.java.Day5_Jan_2_2024_LearningBasicsOfJava;



public class Access_Modifiers {

	// public - the code is accessible for all the classes

	// protected - this code is accessible in the same package and subclasses

	// private - the code is accessible only within the same class

	// default - code is accessible only within the same package

	public static void main(String[] args) {

		AccessModifier_Public_Validation.test1();
		
		
		secretCode();
	}
	
	private static void secretCode() {
		System.out.println("Secret Code");
	}

	
    static void hello() {
		//this is a default method
	}
}
