package com.automation.Day6_Jan_3_2024_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_SignIn_Locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		//Click on Sign in link
		driver.findElement(By.className("signin")).click();
		
		//Enter username
		driver.findElement(By.id("login1")).sendKeys("");
		
		//Enter password
		driver.findElement(By.id("password")).sendKeys("");
		
		//Click on signin button
		driver.findElement(By.className("signinbtn")).click();
		
		//click on logout link
		driver.findElement(By.className("rd_logout")).click();
		

	}

}
