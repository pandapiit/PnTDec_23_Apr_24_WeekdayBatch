package com.java.Day23_Mar_05_Collection_Framework;

import java.util.ArrayList;

public class Topic_6_ArrayList_Code {
	
	public static void main(String[] args) {
		discussion1();
		
	}
	
	public static void discussion2() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		//al.add("Red");
		al.add(1);
		//al.add('c');
		//al.add(true);
	}
	
	public static void discussion1() {
		// Adding objects into the ArrayList (Explain indexing) using add() method
		//Printing the ArrayList - []
		ArrayList al = new ArrayList();
		al.add("Hello"); //0th index
		al.add("World"); //1st index
		al.add("Green"); //2nd index
		al.add("Red"); //3rd index
		
		System.out.println(al);
		
		System.out.println("***********************************************************************");
		
		//Retrieving the objects from the ArrayList using index using get() method
		//Object will be returned
		Object obj = al.get(1);
		System.out.println(obj);
		
		// Finding the size of the ArrayList using size() method
		System.out.println(al.size());
		
		//Using for loop for retrieving the objects
		//Using for-each loop for retrieving the objects
		
		for(int i=0 ; i<al.size() ; i++) {
			System.out.println(al.get(i));
		}
		System.out.println("***********************************************************************");	
		for(Object temp : al) {
			System.out.println(temp);
		}
		
		System.out.println("***********************************************************************");	
		
		 //Duplicates are allowed
		 //Insertion order is preserved
		 //null insertion is allowed
		al.add("Hello");
		al.add("World");
		al.add(null);
		System.out.println(al);
		
		//Remove the objects from the ArrayList using remove(object)
		al.remove(null);
		System.out.println(al);
	}

}
