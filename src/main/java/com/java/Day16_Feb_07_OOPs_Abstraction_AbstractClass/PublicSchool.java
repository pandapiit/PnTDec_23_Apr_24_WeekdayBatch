package com.java.Day16_Feb_07_OOPs_Abstraction_AbstractClass;

public class PublicSchool extends Student{
	//can a normal class extend Abstract Class
	//can the School class which is an abstract class act as a parent ?? YES
	
	
	//now you are giving body or implementation to the unimplemented methods of the parent Abstract Class

	@Override
	public void studentMarksheet() {
	System.out.println("Student's marksheet");	
		
	}

	@Override
	public void studentPlayground() {
	System.out.println("Student's playground");	
		
	}
	
	//can the child class have its own methods
	
	public void hallAssembly() {
		
	}
	
	public void schoolCafeteria() {
		
	}


}
