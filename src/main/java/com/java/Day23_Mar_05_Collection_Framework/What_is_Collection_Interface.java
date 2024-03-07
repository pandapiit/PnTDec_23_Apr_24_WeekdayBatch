package com.java.Day23_Mar_05_Collection_Framework;

import java.util.ArrayList;
import java.util.Collection;

public class What_is_Collection_Interface {

	public static void main(String[] args) {
		//Collection - is the root interface in the collection hierarchy
		
		Collection collection = new ArrayList();
		collection.add("Green");
		collection.add("Blue");
		collection.add("Orange");
		collection.add("Red");
		
		System.out.println(collection);
		
		Collection collection1 = new ArrayList();
		collection1.addAll(collection);
		collection1.add("Pink");
		
		System.out.println(collection1);
		
		collection1.remove("Pink");
		
		System.out.println(collection1);
		collection1.removeAll(collection);
		System.out.println("After removing all : " + collection1);
		

	}

}
