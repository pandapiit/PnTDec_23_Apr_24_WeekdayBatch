package com.java.Day4_Dec_27_2023_LearningBasicsOfJava;

public class Inc_Dec_Operators_Example3 {

	public static void main(String[] args) {
		
		
		int i = 1;
	    //int j = ++i + ++i + ++i;
	    int j = i++ + i++ + i++;
	    
	    
	    // j = 1 + 2 + 3 = 6
	    
	    //value of j = 2 + 3 + 4 = 9
	    //position of i = 2, 3, 4
	    
	    System.out.println(i);  //4
	    System.out.println(j);  //9

	}

}
