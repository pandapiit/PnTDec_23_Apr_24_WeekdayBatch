package com.java.Day16_Feb_07_OOPs_Abstraction_AbstractClass;

//An abstract class can hold abstract methods
//A regular class cannot hold abstract methods
//An abstract class can also hold regular methods

public abstract class Student {
	
	
	
	public abstract void studentMarksheet(); // unimplemented or undefined method. This is also known as abstract method.
	                                //a method is known as unimplemented if it has no body
	
	public abstract void studentPlayground();
	
	//public static abstract void studentBasketBallCourt();
	
	//Why can unimplemented method not be static ?

	
	
	  public void studentLibrary() {
	  System.out.println("This is a normal method or a concrete method"); 
	  }
	  
	  public static void studentPrayerRoom() {
	  System.out.println("This is a static method inside abstract class"); 
	  }
	  
	  
	 
}
