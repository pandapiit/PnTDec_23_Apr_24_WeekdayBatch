package com.automation.Day15_Feb_06_2024_Wait_Conditions_in_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login_ExplicitWait {

	public WebDriver driver;
	public WebDriverWait wait;
	

	@Test
	public void validCredentials() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("My Account"))); // clicking on My Account
		driver.findElement(By.linkText("My Account")).click();
		
		//click on Login
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login")));
		driver.findElement(By.linkText("Login")).click();
		
		//entering email
		
	
		
		//entering password
		
		//click on Login
	}

}
