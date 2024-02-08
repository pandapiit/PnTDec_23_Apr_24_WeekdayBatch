package com.java.Day16_Feb_07_OOPs_Abstraction_Interface;

public interface Introduction {

	// 100% abstraction

	// definition: Blueprint of a class
	// it tells a class what to do but does not tell how to do

	// methods inside an interface are abstract and public

	// variables inside an interface as public, static and final
	
	//jdk8 and onwards default concrete/normal methods were allowed
	//jdk9 and onwards private concrete methods were allowed
	//jdk8 and onwards static concrete methods were allowed
	
	
	public static final int i = 10;
	
	public void helloWorld();
	
	default public void check() {
		
	}
	
	private void checkSum() {
		
	}
	
	public static void drum() {
		
	}
	

}
