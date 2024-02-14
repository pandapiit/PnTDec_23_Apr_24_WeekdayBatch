package com.java.Day17_Feb_13_OOPs_this_keyword;

public class What_is_this_keyword {
	
	//this keyword is a reference variable which refers to the Object
	
	private int identity; //instance variable. Is instance variable part of the object ??? YES
	
	
	void setValues(int identity) {
		
		this.identity = identity;
		
		//this keyword refers to the current class instance variable
		
		//but what if this is alone ??? 
		//this will refer to the object
		
	}
	
	
	void getShow() {
		System.out.println(identity);
	}

}
