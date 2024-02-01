package com.java.Day14_Jan_31_OOPs_Constructors;

public class Employee {
	//there are 2000 employees
	
	
	String emp_name; //what is the default value of String in java ? null
	int emp_id;      //what is the default value of int in java ? 0
	
	
	//Object - collection of all non-static entities of the Class
	
	public Employee(String emp_name, int emp_id) {
		this.emp_name = emp_name;
		this.emp_id = emp_id;
		
	}

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Tom", 101);
		System.out.println(emp1.emp_name + "--------------" + emp1.emp_id);
		
	    Employee emp2 = new Employee("John", 102);
	    System.out.println(emp2.emp_name + "--------------" + emp2.emp_id);
		

	}

}
