package com.java.Day23_Mar_05_Collection_Framework;

import java.util.ArrayList;
import java.util.HashSet;

public class Topic_3_What_is_Collection_Framework {
	
	//3 terminologies which are confusing
	
	//1. Collections in java
	//2. Collection framework
	//3. Collection
	
	
	//Collections in Java - Any group of individual objects that are represented as a single unit is known as a Java Collection of Objects
   //Collection framework - it is a set of pre-fined Classes, Interfaces and methods which is used to store multiple data
  //Collection is a pre-defined interface which is one of the root interfaces of Collection framework
//Collection (as a general understanding in java) - is a single entity or an object which can store multiple data[in simple words - to group individual objects as a single entity]
	//framework - represents a library
	
	//two important packages
	
	//java.util.Collection - we can store the data directly
	//java.util.Map - we store in key value pair
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Selenium");
		al.add(true);
		al.add('c');
		
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add("Selenium");
		hs.add(true);
		hs.add('c');
	}

}
