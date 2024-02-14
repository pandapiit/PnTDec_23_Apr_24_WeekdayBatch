package com.java.Day17_Feb_13_OOPs_this_keyword;

public class Use4 {
	//4. this can be used to pass an argument in a method call
	
	public static void main(String[] args) {
		Use4 use4 = new Use4();
		use4.method2();

	}
	
	
	public void method1(Use4 use) {
		System.out.println("I am inside the method1");
		
	}
	
	public void method2() {
		method1(this);
	}

}
