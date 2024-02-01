package com.java.Day14_Jan_31_OOPs_Classes_Objects_and_Methods_Revisited;

//1. Identity - name
//2. State/Attributes - color, breed, age, etc
//3. Behavior - run, eat, sleep, bark, guard - this will be represented in form of methods

public class Animal {
	
	String name;
	String color;
	int age;
	String breed;

	public static void main(String[] args) {

		Animal Buzzo = new Animal();
		Buzzo.running();
		Buzzo.eating();
		Buzzo.sleeping();
		Buzzo.barking();
		Buzzo.name = "Don";

	}

	public void running() {
		System.out.println("Dog runs");
	}

	public void eating() {
		System.out.println("Dog eats");
	}

	public void sleeping() {
		System.out.println("Dog sleeps");
	}

	public void barking() {
		System.out.println("Dog barks");
	}
}
