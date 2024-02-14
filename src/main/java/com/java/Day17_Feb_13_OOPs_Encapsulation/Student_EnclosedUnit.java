package com.java.Day17_Feb_13_OOPs_Encapsulation;

public class Student_EnclosedUnit {

	// 1. declare the instance variables as private

	private String name;
	private int age;
	private double height;

	// 2 write your getter and setter methods which are associated with the instance
	// variables

	public void setData(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;

	}

	public String getNameOfStudentData() {
          return name;
	}

	public int getAgeOfStudentData() {
		return age;

	}

	public double getHeightOfStudentData() {
		return height;

	}

}
