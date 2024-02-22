package com.TestNG.Day20_Feb_21_2024_TestNG_RunningMultipleSuites_Regression;

import org.testng.annotations.Test;

public class RegressionTestCases_Register {
	
	@Test(priority = 1)
	public void test7() {
		System.out.println("Regression Test 1");
	}
	
	@Test(priority = 2)
	public void test8() {
		System.out.println("Regression Test 2");
	}
	
	@Test(priority = 3)
	public void test9() {
		System.out.println("Regression Test 3");
	}

}
