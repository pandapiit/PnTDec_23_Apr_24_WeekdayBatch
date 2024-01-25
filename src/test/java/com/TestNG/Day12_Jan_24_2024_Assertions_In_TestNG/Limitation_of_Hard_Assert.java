package com.TestNG.Day12_Jan_24_2024_Assertions_In_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Limitation_of_Hard_Assert {
	
	@Test
	public void checkingHardAssertSituation() {
		int i  = 10;
		int j  = 20;
		System.out.println(i + j); //30
		Assert.assertTrue(i != j); //this is true 
		System.out.println(2*(i+j)); //60
		Assert.assertEquals(i, j); //false. Whenever there is a false Assertion, then Assert will not proceed
		System.out.println(5 + 5); //10
		//
		//
		//
		//
	}

}
