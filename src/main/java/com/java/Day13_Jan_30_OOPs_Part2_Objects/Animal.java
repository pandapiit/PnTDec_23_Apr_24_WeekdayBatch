package com.java.Day13_Jan_30_OOPs_Part2_Objects;

public class Animal {
//To understand the concept of Objects even better, you have to know 3 things
	
	//1. Declaration
	//2. Instantiation
	//3. Initialization
	
	
	String name = "Buzzo";
	String breed = "Labrador";
	int age = 3;
	static int no_of_paws = 4;
	String color = "fawn";
	
	
	//How will I create Object of this Class
	
	public static void main(String[] args) {
		new Animal();
		new Animal();
		new Animal();
		
		Animal animal = new Animal();
		Animal animal1 = new Animal();
		
		//Animal is the Class
		//animal is the reference of the class which is poitining to the object
		//new Animal() is the object
		
		
		//The most important definition of an object
		//Object is the collection of all non-static entities of the Class
		

		
	}
	
	
}
