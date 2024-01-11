package com.java.Day7_Jan_9_2024_ControlStatements;

public class Do_While_Loop {

	public static void main(String[] args) {
		int i = 0;
		do {
			//body of the do block
			//first the do block will be executed.
			//Then it will check for the while condition
			//if the while condition is true then again the do block will execute
			//if the while condition is false then do block will not execute
			i++;
			System.out.println(i);
		}
		
        while(i<5);       
	}

}
