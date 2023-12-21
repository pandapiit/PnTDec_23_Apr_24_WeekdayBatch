package com.java.Day3_Dec_20_2023_LearningBasicsOfJava;

public class Concatenation_Operator {

	public static void main(String[] args) {
		//the symbol of concatenation is +
		//concatenation is known as joining
		
		int a = 10;
		int b = 20;
		String S1 = "HelloWorld";
		String S2 = "LearningJava";
		
		System.out.println(a + b + S1 + S2);
		//                (10 + 20 + HelloWorld + LearningJava)
		System.out.println(S1+S2+(a+b));
		//                (HelloWorld + LearningJava + 10 + 20)
	}

}
