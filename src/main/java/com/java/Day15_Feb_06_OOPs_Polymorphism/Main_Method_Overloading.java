package com.java.Day15_Feb_06_OOPs_Polymorphism;

public class Main_Method_Overloading {
	//Can main method be overloaded

	public static void main(String[] args) {
		
       main(10);
       main(args = new String[3], args = new String[2]);
	}
	
	
	public static void main(int a) {
		System.out.println(100 + 100);
	}
	
	public static void main(String[] args1, String[] args2) {
		System.out.println("This is overloaded main method with two String array parameters");
	}

}
