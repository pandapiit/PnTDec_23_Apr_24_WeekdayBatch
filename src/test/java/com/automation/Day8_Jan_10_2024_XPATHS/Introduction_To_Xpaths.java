package com.automation.Day8_Jan_10_2024_XPATHS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction_To_Xpaths {

	//What is Xpath?
	//Address of a Web Element
	
	//How many types of Xpaths are there ?
	//There are 2 types
	//i. Absolute Xpath
	//ii. Relative/Dynamic/Customized Xpath
	
	//Which Xpath is more accurate?
	//Ans: Absolute Xpath is more accurate
	
	//Which Xpath is safe to use in Automation?
	//Ans: Relative Xpath
	
	public static void main(String[] args) {
		/*
		 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://rediff.com");
		 * driver.findElement(By.xpath("//a[@class = 'signin']")).click();
		 * driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys(
		 * "seleniumpanda@rediffmail.com");
		 * driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys(
		 * "Selenium@123");
		 * driver.findElement(By.xpath("//input[@name = 'proceed']")).click();
		 */
		//useOfXpathInCompoundedValueClass();
		xpathSyntax4();
	}
	
	
	public static void useOfXpathInCompoundedValueClass() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		//driver.findElement(By.className("bmailicon relative")).click();
		driver.findElement(By.xpath("//a[@class = 'bmailicon relative']")).click();
	}
	
	public static void xpathSyntax4() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//a[text() = 'Create Account']")).click();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
