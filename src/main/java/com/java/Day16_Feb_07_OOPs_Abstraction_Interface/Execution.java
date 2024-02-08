package com.java.Day16_Feb_07_OOPs_Abstraction_Interface;

public class Execution implements Introduction, Conclusion{
	
	//Execution is the child class
	//What is Execution class doing ?
	//it is implementing all the unimplemented methods of the interface
	
	//So Execution is what ? It is the implementing Class of the interface

	public static void main(String[] args) {
		
		Conclusion reference = new Execution();
		//reference of the interface is pointing towards the object of the Class
		
		//WebDriver driver = new ChromeDriver();
		

	}

	@Override
	public void helloWorld() {
		
		
	}

	@Override
	public void tearDown() {
	
		
	}

	@Override
	public void codeEnd() {
	
		
	}

	@Override
	public void disconnectDB() {
		
		
	}

}
