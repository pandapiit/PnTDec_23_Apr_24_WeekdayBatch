package com.java.Day20_Feb_21_OOPs_Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Topic_9_Throws_keyword {
	
	public static void main(String[] args) throws FileNotFoundException {
		filePresentOrNot();
	}
	
	public static void filePresentOrNot() throws FileNotFoundException {
		FileInputStream ip = new FileInputStream("C:\\Users\\sarth\\OneDrive\\Desktop\\Login.txt");
	}

}
