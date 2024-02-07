package com.java.Day15_Feb_06_OOPs_Inheritance;

public class Child extends Parent { //extends keyword establishes the parent-child relationship
	// Criteria 1 - Method name should be the same
	// Criteria 2 - Class name will be different
	// Criteria 3 - Arguments will be the same
	// Critera 4 - Inheritance has to be there
	
	public Child() {
		super(); //this will invoke Parent class constructor
		System.out.println("This is Child's class constructor");
	}
	
	public void superCar() {
		System.out.println("This is child's super car");
	}
	
	public void guitar() {
		System.out.println("Child's guitar");
	}

}
