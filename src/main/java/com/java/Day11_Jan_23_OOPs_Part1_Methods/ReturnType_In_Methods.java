package com.java.Day11_Jan_23_OOPs_Part1_Methods;

public class ReturnType_In_Methods {
	// Definition - independent units of execution
	// it is a logical house or it stores logic. It is kind of a factory
	// raw material --- machine --- output

	// accessmodifier static void(return type of the method) nameoftheMethod(){ }

	public static void main(String[] args) {

		int k = methodName(20, 30);
		System.out.println(k);	
	
	}

	public static int methodName(int i, int j) {
		// logical factory
		int k = i + j;
	   return k;
			
	}

}
