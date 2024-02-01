package com.java.Day14_Jan_31_OOPs_Constructors;

public class What_is_a_Constructor {

	// Constructor can acknowledge all the 4 access modifiers
	
	  public What_is_a_Constructor(String name, int age) {
		  
	  }
	  
	  
	  public What_is_a_Constructor(String name, int age, double height) {
		  
	  }
	  
	  public What_is_a_Constructor() {
		  
	  }
	
	public static void main(String[] args) {
		What_is_a_Constructor reference = new What_is_a_Constructor("Rahul", 10);
		
		What_is_a_Constructor reference1 = new What_is_a_Constructor("Don", 21, 5.10);
		
		What_is_a_Constructor reference2 = new What_is_a_Constructor();
	}
	
	
	
	 

	public void test() {

	}

	// if some entity has a body then we call that entity a block

	// Constructor is a block which looks like a method but it is not a method
	
	// Constructor has no return type. Not even void.
	
	
	//When does a Constructor come into picture or when does it appear or when is it invoked?
	//the moment an Object is created, constructor is invoked
	
	//What are the uses of Constructor?
	//1. Initialize the object
	//2. Optimize the code
	
	//How many types of constructors are there?
	//1. default constructor which is invisible and is created by the compiler the moment an object is created
	//2. user-defined constructor (no argument)
	//3. user-defined constructor (arguments / parameters)
	
	
	


}
