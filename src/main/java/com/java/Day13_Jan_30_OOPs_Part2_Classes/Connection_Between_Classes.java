package com.java.Day13_Jan_30_OOPs_Part2_Classes;

public class Connection_Between_Classes {

	public static void main(String[] args) {
		logic1.test1();
		logic2.test2();
		
		
		logic3 logicthree = new logic3();
		logicthree.test3();

	}

}

class logic1 {
	
	public static void test1() {
     System.out.println("The Sky is blue");
	}

}

class logic2 {
	
	public static void test2() {
	     System.out.println("The Grass is green");
		}

}


class logic3 {
	
	public void test3() {
		System.out.println("The road is black");
	}
}
