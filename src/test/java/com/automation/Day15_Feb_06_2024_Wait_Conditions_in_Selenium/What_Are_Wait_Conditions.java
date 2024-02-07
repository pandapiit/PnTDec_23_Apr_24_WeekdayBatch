package com.automation.Day15_Feb_06_2024_Wait_Conditions_in_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class What_Are_Wait_Conditions {

	// There are 3 types of wait conditions in Selenium

	// 1. implictWait
	// 2. explicitWait
	// 3. fluentWait

	public WebDriver driver;
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@Test
	public void implicitWaitUnderstanding() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(1000));

		driver.findElement(By.linkText("My Account")).click();
	}

	@Test
	public void explicitWaitUnderstanding(){
		// java has some wait conditions
		// Thread.sleep(2000); defined within java
		//WebDriverWait - this is the class which helps us to write Explicit Wait conditions for Selenium
		//Step 1 - Create the Object of WebDriver Wait
		//Step 2 - the constructor of WebDriverWait() cannot be empty. You have to pass driver and Duration.ofSeconds(10)
		//Step 3 - use the reference to call the overloaded method until and use ExpectedConditions Class to call lots of methods

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("My Account")));
      
		driver.findElement(By.linkText("My Account")).click();
		
		driver.findElement(By.linkText("Login")).click();
	}
}
