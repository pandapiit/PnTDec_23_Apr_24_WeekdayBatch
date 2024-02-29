package com.java.Day22_Feb_28_Strings;

public class Topic4_String_final {

	public static void main(String[] args) {
		int i = 10;
		i = 11;
		System.out.println(i);
		
		final int j = 20;
	    System.out.println(j);
	    
	    
	    String S1 = new String("Apple");
	    S1.concat("Mango");
	    
	    System.out.println(S1); //String is immutable.
	    
	    S1 = S1.concat("Guava");
	    System.out.println(S1);
		

	}

}
