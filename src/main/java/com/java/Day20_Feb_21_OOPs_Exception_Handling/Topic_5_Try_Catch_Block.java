package com.java.Day20_Feb_21_OOPs_Exception_Handling;

public class Topic_5_Try_Catch_Block {
	
	//Default Exception Handler
	
	public static void main(String[] args) {
		int a=100, b=0, c; 
		
		try { //try block will hold the risky code
			c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			// catch block will hold the handling code
			e.printStackTrace();
		}
				
			
		System.out.println(20 + 30);
		
	}
	
	//Logic:-
	//Exception will occur because of a programming mistake. The method which has the programming mistake - typically should take responsibility
	//to handle that mistake. 
	//The main() method will create an Object.
	//The object will have 3 entities - ExceptionName, ExceptionDescription, StackTrace
	//This object will be passed to JVM. JVM will check if it can handle the object.
	//If JVM cannot handle the object, then it will pass it on to Default Exception Handler
	//And in the meanwhile the main() method will get abruptly terminated.
	//Then DEH will print the Exception.
	
	
	//If you want to manually handle the Exception, then use try catch block

}
