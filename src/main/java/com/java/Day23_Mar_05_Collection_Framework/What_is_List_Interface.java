package com.java.Day23_Mar_05_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class What_is_List_Interface {
	//List interface is one of the children of Collection interface
	//List stores data in an indexing fashion or index based data structure
	//List interface has the following implementing classes - ArrayList, LinkedList, Vector, Stack

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Pink");
		list.add("Yellow");
		list.add("Orange");
		list.add("Violet");
		
		//how to traverse within a List using Iterator
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	

	}

}
