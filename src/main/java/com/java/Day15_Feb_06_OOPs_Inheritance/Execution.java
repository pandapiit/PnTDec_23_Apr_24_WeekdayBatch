package com.java.Day15_Feb_06_OOPs_Inheritance;

public class Execution {

	public static void main(String[] args) {
		
		//Create the Object of the Child class here
		
		Child child = new Child();
		child.guitar();
		child.superCar();
		child.bankBalance();
		child.fixedDeposits();
		
		
		//can the parent inherit child's class properties
		
		Parent parent = new Parent();
		parent.bankBalance();
		parent.fixedDeposits();
		
	}

}
