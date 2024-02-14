package com.java.Day17_Feb_13_OOPs_this_keyword;

public class Use3 {
	//3. this() can be used to invoke current class constructor

	public static void main(String[] args) {

		//Use3 use3 = new Use3();
		
		Use3 usee3 = new Use3(10);
		
	}
	
	
	public Use3() {
		System.out.println("This is cosntructor and I am trying to get the value from inside");
	}
	
	public Use3(int i) {
		this();
		System.out.println("Parameterized constructor");
		//this();     //constructor call must be the first statement in a constructor
		
	}
	

}
