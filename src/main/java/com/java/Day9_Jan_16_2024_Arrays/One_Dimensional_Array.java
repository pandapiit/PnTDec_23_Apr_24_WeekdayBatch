package com.java.Day9_Jan_16_2024_Arrays;

public class One_Dimensional_Array {
	
	    //1. Declaration of Array
		//2. Create an Array
		//3. Initialize an Array
		//4. Retrieve elements of the Array
	
	//1-D []


	public static void main(String[] args) {
		//Declaration
		
		int a0[]; //this one is the most popular way of declaring an array
		int[] a1;
		int[]a2;
		int[] b1, c1; //b1 is 1-D array, c1 is also 1-D array.
		int b2[], c2; //b2 is 1-D array, c2 is just an int variable.
		int b3, c3[]; //b3 is just an int variable, c3 is 1-D array
		int[] b4, c4[]; //b4 is 1-D, c4 is 2-D array
		
		
		
		//Creation
		//we use the reserved keyword new
		 a0 = new int[3];
		
		//Creation + initialization
		int a[] = new int[3];
		
		int b[] = new int[5];
		
		//determine the length of a and b arrays ??
		
		System.out.println("the length of array a is : " + a.length);
		System.out.println("the length of array b is : " + b.length);
		
		//b has 5 elements
		//indexing position starts from 0 and in this case it will end in 4th position
		
		// int c[] = new int[5];
		// c[0] = 111;
		// c[1] = 222;
		// c[2] = 333;
		// c[3] = 444;
		// c[4] = 555;
		
		// int c[] = new int[] {111, 222, 333, 444, 555};
		
		
		//declaration, creation and initialization
		int c[] = {111, 222, 333, 444, 555};
		
		System.out.println("The length of array c is : " + c.length);
		
		
		//retrieve elements of an array
		
		int d[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		String S1[] = {"Java", "Python", "C#", "Javascript", "C++", "Ruby", "Perl", "PHP"};
		
		for(int i=0 ; i<d.length ; i++) {
			System.out.print(d[i] + " ");
		}
		
		System.out.println();
		
		for(int i=0 ; i<=S1.length-1 ; i++) {
			System.out.print(S1[i] + " ");
		}
		
		System.out.println();
		
		//Please retrieve a specific element. For example retrieve element present in position no 9 in d array
		
		System.out.println("the 9th element in array d is : " + d[8]);
		
		//Please retrieve a specific element. For example retrieve element present in position no 16 in d array
		//System.out.println("the 9th element in array d is : " + d[15]); //IndexArrayOutOfBoundException

		
		doubt();
	}
	
	
	
	 public static void doubt() {
		 //print first 10 natural numbers ?
		 //1................10
		 
		 for(int i=1 ; i<11 ; i++) {
			 System.out.print(i + " ");
		 }
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
