package com.TestNG.Day10_Jan_17_2024_Introduction_to_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Of_TestNG {
	
	//We will write the TestNG annotations on the basis of execution priority
	//which annotation will execute first
	
	@BeforeSuite
	public void beforeSuiteMethod() {
		System.out.println("This is Before suite annotation - we are checking whether it is execting first or not");
	}
	
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("Before Test annotation gets executed after BeforeSuite annotation - so this 2nd");
	}

	@BeforeClass
	public void beforeClassMethod() {
		System.out.println("This will be executed 3rd");
	}
	
	@BeforeMethod
	public void beforeMethodMethod() {
		System.out.println("This will be executed after BeforeClass annotation - Rank 4th");
	}
	
	@Test
	public void testCase1() {
		System.out.println("The sum of 2 and 3 is : " + (2+3));
	}
	
	@AfterMethod
	public void afterMethodMethod() {
		System.out.println("This will be executed - Rank 5th");
	}
	
	@AfterClass
	public void afterClassMethod() {
		System.out.println("Rank 6th");
	}
	
	@AfterTest
	public void afterTestMethod() {
		System.out.println("Rank 7th");
	}
	
	@AfterSuite
	public void afterSuiteMethod() {
		System.out.println("Final execution annotation");
	}
	
	
	

}
