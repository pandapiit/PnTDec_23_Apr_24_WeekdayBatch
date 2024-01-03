package com.java.Day4_Dec_27_2023_LearningBasicsOfJava;

public class Inc_Dec_Operators_Example5 {

	public static void main(String[] args) {
		
		int i = 10; //latest value of i is 10
		
		        int j = i-- - i++ + ++i;
		//how many variables - i and j
		        //  j = 10 - 9   + 11 = 12
		        
		        // i = 9,     10,    11
		        
		        
		        
		// equation j = 10  -  9 + 11 = 12 is the value of j at this place
		//position of i = 9,  10 , 11 = i is 11
		        
		        //i is 11
		        //j is 12
		
		int k = --i + --j - j-- + i++ + --i;
		
		//  k = 10 + 11  - 11  + 10  + 10 = 30
		// i  = 10,              11,    10 = 10
		// j  =       11,   10               10
		System.out.println("***********************");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println("************************");
		
		//i = 10
		//j = 10
		//k = 30
		int l = i++ + j++ + ++k - --k + k--;
		
		// l = 10 + 10 + 31 - 30 + 30 = 51
		
		//i =                           11
		// j                            11
		//k                  31,  30,   29
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);

	}

}
