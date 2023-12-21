package com.java.Day3_Dec_20_2023_LearningBasicsOfJava;

public class Operators_In_Java {
	
	//Arithmetic Operators
	//Assignment Operators
	//Comparison Operators
	//Logical Operators
	//Bitwise Operators

	public static void main(String[] args) {
		
		//Arithmetic Operators
		// +     -      /     *    %      ++     --
		
		int i = 10;
		int j = 3;
		System.out.println(i % j);
		
		//   ++ is known as increment (increase by 1) operator	
		//   -- is known as decrement (decrease by 1) operator
		int a=1;
		a--;   
		System.out.println(a);
		
		
		
		//Assignment Operators
		//    =    +=   -=  *=   /=  %=   &=  |=  ^=  >>=  <<=
		
		int b = 1;
		
		//Comparison Operators
		
		//   >    <    ==  >=    <=   !=  
		
		int d = 20;
		int e = 20;
		int f = 21;
		
		System.out.println(d == e);
		System.out.println(e == f);
		System.out.println(d < e);
		System.out.println(d > e);
		System.out.println(d >= e);
		System.out.println(d <= e);
		System.out.println(d != e);
		System.out.println(f != e);
		
		//Logical Operators
		
		//System.out.println(true  and  false); //false
		//System.out.println(true  or  false); //true
		//System.out.println(false  or  true); //true
		//System.out.println(false  or  false); //false
		//System.out.println(true  and  true); //true
		//System.out.println(false  and  false); //false
		
		// && -  Logical AND
		// || -  Logical OR
		//  !  - Logical NOT
		
		System.out.println(d==e  &&  f!=e  &&  d>e);
		System.out.println(d==e  &&  f!=e  ||  d>e);
	}

}
