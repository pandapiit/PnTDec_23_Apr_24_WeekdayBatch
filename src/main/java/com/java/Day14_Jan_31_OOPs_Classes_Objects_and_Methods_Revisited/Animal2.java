package com.java.Day14_Jan_31_OOPs_Classes_Objects_and_Methods_Revisited;

public class Animal2 {
	
	//Initalize the object using methods
	
	String color;
	int age;
	
	public static void main(String[] args) {
		Animal2 buzzo = new Animal2();
        buzzo.initializeObject("Black", 7);
		buzzo.display();

	}
	
	public void initializeObject(String c, int a) {
		color = c;
		age = a;
	}
	
	public void display() {
		System.out.println(color + "------" + age);
	}
	
	


}


