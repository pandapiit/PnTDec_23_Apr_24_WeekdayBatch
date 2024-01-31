package com.java.Day13_Jan_30_OOPs_Part2_Objects;

public class Static_And_NonStatic {
	
	// static is mostly used when it is not supposed to change
	//if it is supposed to change we tend not to use static
	
	//non-static - entities which do not have static keyword associated with it
	//non-static is purely for the Object. It is close to the Object family
	//static basically will be directly associated with the Class
	
	//Object - collection of all non-static entities of the class
	
	
	//Certain set of rules for static and non-static
	//static can only call static
	//static cannot call non-static
	
	//non-static can call nonstatic 
	//non-static can also call static. IT will work but it is not recommended
	
	static int age = 4;
	String name = "Tom";

	public static void main(String[] args) {
    //main method is static
    addition();
    System.out.println(age);
    
    Static_And_NonStatic driver = new Static_And_NonStatic();
    driver.multiplication();
    
    
	}
	
	public static void addition() {
		int i=1; int j = 2;
		System.out.println(i+j);
	}
	
	public void multiplication() {
		int i=3; int j = 2;
		System.out.println(i*j); //6
		modulusOperation();//1
	}
	
	public void modulusOperation() {
		int i = 10;
		int j = 3;
		System.out.println(i % j);
	}

}
