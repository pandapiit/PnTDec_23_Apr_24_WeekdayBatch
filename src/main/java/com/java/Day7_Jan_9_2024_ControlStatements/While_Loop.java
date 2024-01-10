package com.java.Day7_Jan_9_2024_ControlStatements;

public class While_Loop {

	public static void main(String[] args) {
		//when the knowledge of end point is not clear
		//when something tends to infinty
		
		//we use while loop
		
		//cnn.com is a news website
		//today the total no of links = 343
		
		int i=1;
		while(i < 6) {
			System.out.println("Keep printing the value of i");
			i=i+5; 
		}
		
		
		String S1 = "World";
		while(S1.equals("World1")) {
			System.out.println("Nothing World");
		}
		
		//WAJP to print 1st 100 natural/whole numbers using while loop
		
		int a=1;
		while(a<=100) {
			System.out.print(a + " ");
			a++;
		}
		
		System.out.println();
		
		//WAJP to print  100 natural numbers in a reverse manner starting with 100 using while loop
		//100 ............................................... 1
		
		int b = 100;
		while(b >=1) {
			System.out.print(b + " ");
			b--;
		}
		
		//WAJP to print 20 multiples of 5 using while loop
		//5..10..15...20...25...30.............................100
		
		System.out.println();
		
		
		int c = 5;
		while(c <= 100) { //I do not want to specify end point
			System.out.print(c + " ");
			c = c + 5;
		}
		
		
		System.out.println();
		
		
		int j=1;
		while(j<=20) {
		System.out.print(j*5 + " ");
		j++;
		}
		
		System.out.println();
		
		//WAJP to print 1083 multiples of 97 using while loop
		
		int k=1;
		while(k<=1083) {
		System.out.print(k*97 + " ");
		k++;
		}
	}

}
