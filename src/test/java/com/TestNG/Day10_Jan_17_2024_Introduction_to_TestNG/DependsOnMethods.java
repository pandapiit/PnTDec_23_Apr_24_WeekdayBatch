package com.TestNG.Day10_Jan_17_2024_Introduction_to_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test(priority=1)
	public void testCase1() {
		System.out.println("Test Case 1 is independent and has to execute first");
	}
	
	@Test(priority=2, dependsOnMethods = "testCase1")
	public void testCase2() {
		System.out.println("Test Case 2 is dependent on Test Case1");
		Assert.fail("Deliberate Failure");
	}
	
	@Test(priority=3, dependsOnMethods = {"testCase1", "testCase2"})
	public void testCase3() {
		System.out.println("Test Case 3 is dependent on both Test Case1 and test Case2");
	}

}
