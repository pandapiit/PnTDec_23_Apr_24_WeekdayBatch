package com.java.Day15_Feb_06_OOPs_Polymorphism;

public class Student extends School {
	//Method overriding means Child class method is taking precedence over the Parent class method

	// Criteria 1 - Method name should be the same
	// Criteria 2 - Class name will be different
	// Criteria 3 - Arguments will be the same
	// Critera 4 - Inheritance has to be there

	public static void main(String[] args) {
		Student student = new Student();
		student.playSports();
		student.education();
		student.mandatoryFees(1000);

	}
	
	//Access modifier of overriden method in child class should be equivalent or higher than the parent Class method

	public void playSports() {
		System.out.println("Student can select alloted sports in the school");
	}
	
	
	public void education() {
		System.out.println("This education method child is overriding from the parent");
	}
	
	public void mandatoryFees(int i) {
		System.out.println("The fees per student per semester is : " + i);
	}

}
