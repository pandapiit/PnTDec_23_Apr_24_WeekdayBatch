package com.java.Day9_Jan_16_2024_Arrays;

public class Class_Assignment_1 {

	
	public static void main(String[] args) {

		// 1st array - Make an int array with 20 elements in it
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		// 2nd array - Make a decimal array with 10 elements in it
		double b[] = { 1.2, 2.3, 3.4, 5.3, 6.4, 7.8, 8.8, 9.6, 3.4, 7.5 };
		// 3rd array - Make a String array with 5 elements in it
		String S[] = { "Hello", "Hi", "How", "Are", "You" };
		
		// Use for loop to retrieve all the elements of each array mentioned above
		
		for(int i=0 ; i<=a.length-1 ; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
		
		for(int i=0 ; i<=b.length-1 ; i++) {
			System.out.print(b[i] + ", ");
		}
		System.out.println();
		
		for(int i=0 ; i<=S.length-1 ; i++) {
			System.out.print(S[i] + ", ");
		}
		System.out.println();
		
		// Retrieve the 20th element of 1st array
		System.out.println("The 20th element of first array is : " + a[19]);
		
		// Retrieve the 11th element of 2nd array
		try {
			System.out.println("The 11th element of second array is : " + b[10]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Retrieve the 1st element of 3rd array
		System.out.println("The 1st element of third array is : " + S[0]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
