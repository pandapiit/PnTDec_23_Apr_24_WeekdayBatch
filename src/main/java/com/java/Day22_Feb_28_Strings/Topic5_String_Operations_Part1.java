package com.java.Day22_Feb_28_Strings;

public class Topic5_String_Operations_Part1 {

	public static void main(String[] args) {
		//difference between length and length()
		//length is a pre-defined variable which returns size of the array
		//length is a method used to find the length of the String literal
		
		int[] a = {1, 2, 3, 4, 5, 6};
		System.out.println("The size of the array is :" + a.length);
		
		String S1 = "We are learning Java and Selenium";
		System.out.println("The length of the String is : " + S1.length());
		
		//length() - return type is int
		//String S0 = null;
		//System.out.println(S0.length());
		
		//isEmpty() - return type is boolean
		String S2 = "";
		System.out.println(S2.isEmpty());
		
		//trim() - this method removes the blank spaces before and after the String. Return type is String
		String S3 = "      Good Morning     ";
		System.out.println(S3.length());
		String S4 = S3.trim();
		System.out.println(S4.length());
		System.out.println(S4);
		//using trim() and length() together - S.trim().length(); if used together because length() returns int this will also return int
		String S5 = "       Hello World Hi      ";
		System.out.println(S5.length());
		int val = S5.trim().length();
		System.out.println(val);
		
		//compare two string using equals, equalsIgnoreCase, compareTo(), compareToIgnoreCase()
		String S6 = "Python";
		String S7 = "Java";
		System.out.println(S6.equals(S7));
		String S8 = "JAVA";
		System.out.println(S7.equals(S8));
		System.out.println(S7.equalsIgnoreCase(S8));
		
		String S9 = "I am learning Java and Selenium";
		String S10 = "I am learning Python and Selenium";
		System.out.println(S9.compareTo(S10)); //how to find out the answer -6
		
		//https://unicodelookup.com/
		String S11 = "a"; //unicode value of a is 97
		String S12 = "A"; //unicode value of A is 65
		System.out.println(S11.compareTo(S12)); //97-65 = 32
		System.out.println(S11.compareToIgnoreCase(S12)); //0
		String S13 = "Q"; //81
		String S14 = "r"; //114
		System.out.println(S13.compareTo(S14)); //81 - 114 = -33
		System.out.println(S13.compareToIgnoreCase(S14)); //81-82 = -1
		
		//add/concat() Strings
		String S15 = "Monkey";
		String S16 = "Donkey";
		String S17 = S15 + S16;
		System.out.println(S17);
		String S18 = "Bully";
		System.out.println(S17.concat(S18)); //MonkeyDonkeyBully
		
		//join
		String S19 = "BMW";
		String S20 = "Audi";
		String S21 = "Volvo";
		System.out.println(String.join(":", S19, S20, S21));
		
		//subSequence()
		
		//substring()
		String S22 = "ToyotaHondaNissan";
		System.out.println(S22.substring(4));
		System.out.println(S22.substring(2, 10));
		System.out.println(S22.substring(0,0)); //blank output

	}

}
