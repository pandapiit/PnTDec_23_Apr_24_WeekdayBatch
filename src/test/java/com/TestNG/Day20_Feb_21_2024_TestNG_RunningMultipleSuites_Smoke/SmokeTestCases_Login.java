package com.TestNG.Day20_Feb_21_2024_TestNG_RunningMultipleSuites_Smoke;

import org.testng.annotations.Test;

public class SmokeTestCases_Login {
	
	@Test(priority = 1)
	public void test7() {
		System.out.println("Smoke Test 1");
	}
	
	@Test(priority = 2)
	public void test8() {
		System.out.println("Smoke Test 2");
	}
	
	@Test(priority = 3)
	public void test9() {
		System.out.println("Smoke Test 3");
	}

}
