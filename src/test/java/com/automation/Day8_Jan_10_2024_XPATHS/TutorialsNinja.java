package com.automation.Day8_Jan_10_2024_XPATHS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinja {
	//html[@attribute = 'value']
	//html[@attribute1 = 'value' and @attribute2 = 'value']
	//html[@attribute1 = 'value' or @attribute2 = 'value']
	//html[text() = 'valueofthetext']
	//html[contains(text(), 'valueofthetext')]
	//html[contains(@attribute, 'valueoftheattribute')]
	//html[starts-with(@attribute, 'startingvaluewhichisfixed')]
	//html[ends-with(@attribute, 'endingvaluewhichisfixed')]

	public static void main(String[] args) {
		loginTNUsingXpath();
		//registerTNUsingXpath();
	}
	
	public static void loginTNUsingXpath() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Login')]")).click();
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'input-password' and @name = 'password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[contains(@class, 'btn btn-primary')]")).click();
		
	}
	
	public static void registerTNUsingXpath() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Register')]")).click();
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("Panda");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda40@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
	}

}
