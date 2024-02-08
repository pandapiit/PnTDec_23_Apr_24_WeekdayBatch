package com.java.Day16_Feb_07_OOPs_Abstraction_AbstractClass;

public class PrivateSchool extends Student{

	public static void main(String[] args) {
		PrivateSchool privateschool = new PrivateSchool();
		privateschool.studentMarksheet();
		privateschool.studentPlayground();
		privateschool.studentLibrary();
		
		PrivateSchool.studentPrayerRoom();
		
		//Try creating the Object of parent class
		
		// Student student = new Student(); //can never create the Object of abstract class
		
		Student stud = new PrivateSchool(); //here the Parent class reference is poiting to Child Class object
		stud.studentMarksheet();
		stud.studentPlayground();

	}
	
	public void studentLibrary() {
		System.out.println("Child's logic");
	}
	

	@Override
	public void studentMarksheet() {
	
		
	}

	@Override
	public void studentPlayground() {
		
		
	}

}
