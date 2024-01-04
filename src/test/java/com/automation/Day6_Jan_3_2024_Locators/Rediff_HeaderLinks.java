package com.automation.Day6_Jan_3_2024_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_HeaderLinks {
	
	//id
	//className
	//name
	//linkText
	//partiallinkText
	//xpath
	//cssSelector
	//tagname

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		
		//Create Account - text of the link
		//Create Acc     - partial text of the link
		
		driver.findElement(By.linkText("Money")).click();
		


	}

}
