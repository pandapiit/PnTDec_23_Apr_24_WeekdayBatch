package com.java.Day13_Jan_30_OOPs_Part2_Objects;

public class Defining_Object {
	
	//Object is collection of all the non static entities of the Class
	//
	
	String name;
	int age;
	static int no_of_paws;
	String color;
	
	public static void main(String[] args) {
		
		
		
		//you can call a static entity directly or with the help of the Classname
		//if you want to call a non-static entity you have to create the Object
		
		Defining_Object.checkBehavior();
		
		Defining_Object defo = new Defining_Object();
		                defo.checkingSpeed();
		                defo.sleepingTechniques();
		
	}
	
	
	public static void checkBehavior() {
		System.out.println("Labradors are Docile");
	}
	
	public void checkingSpeed() {
		System.out.println("Labradors are fast runners and fast swimmers");
	}

	
	public void sleepingTechniques() {
		System.out.println("Labradors sleep in weird poses");
	}
}
