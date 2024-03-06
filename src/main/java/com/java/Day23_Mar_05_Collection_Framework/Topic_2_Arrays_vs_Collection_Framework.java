package com.java.Day23_Mar_05_Collection_Framework;

import java.util.ArrayList;

public class Topic_2_Arrays_vs_Collection_Framework {

	public static void main(String[] args) {
		
		//Difference no 1 - Arrays can store both primitive and non-primitive DS but Collection framework can store only Non-Primitive DS
		
		int[] a = {1, 2, 3, 4, 5}; //example of storing primitive 
	
		Topic_2_Arrays_vs_Collection_Framework obj1 = new Topic_2_Arrays_vs_Collection_Framework();
		Topic_2_Arrays_vs_Collection_Framework obj2 = new Topic_2_Arrays_vs_Collection_Framework();
		Topic_2_Arrays_vs_Collection_Framework obj3 = new Topic_2_Arrays_vs_Collection_Framework();
		Topic_2_Arrays_vs_Collection_Framework obj4 = new Topic_2_Arrays_vs_Collection_Framework();
		Topic_2_Arrays_vs_Collection_Framework obj5 = new Topic_2_Arrays_vs_Collection_Framework();
		
		Topic_2_Arrays_vs_Collection_Framework[] ref = {obj1, obj2, obj3, obj4, obj5}; //example of storing non primitive
		
		
		ArrayList al = new ArrayList();
		al.add(10); //what is 10 here ? Integer Object
		al.add("Java");
		al.add('c');
		
		
		
	}

	
	//Difference no 2 - Arrays can store mostly homogeneous form of data excepting in some cases like int as it can be type casted automatically
			//but collection framework can store hetergeneous type of data
	
	public void difference2() {
		int[] a = {1, 2, 3, 4, 5};
		int[] a1 = {1, 2, 'c', 5, 5};
		
		boolean[] b1 = {true, false, 1<3, 2>4};
		Topic_2_Arrays_vs_Collection_Framework obj6 = new Topic_2_Arrays_vs_Collection_Framework();
		
		ArrayList al = new ArrayList();
		al.add(10); //what is 10 here ? Integer Object
		al.add("Java");
		al.add('c');
	}
}
