package com.java.Day4_Dec_27_2023_LearningBasicsOfJava;

public class Inc_Dec_Operators_Example4 {

	public static void main(String[] args) {
		
		
		int i=1;  //latest value of i is 1
		
		int j = i++; //at this position latest value of j is 1, and i is 2
		// j = 1
		
		int k = ++i + j++;  //at this position i=3, j=2, k=4
		// k = 3    + 1 = 4
		// i = 3
		// j =        2
		
		
		int l = ++i + ++j + k++ + i++;
		// l = 4 + 3 + 4 + 4 = 15
		
		// i = 4                   5
		//j =        3
		// k                5
		
		
		
		
		
		
		
		System.out.println(i); 
		System.out.println(j); 
		System.out.println(k); 
		System.out.println(l); 
		

	}

}
