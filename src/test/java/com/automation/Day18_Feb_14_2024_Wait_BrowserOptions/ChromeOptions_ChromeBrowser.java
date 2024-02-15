package com.automation.Day18_Feb_14_2024_Wait_BrowserOptions;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChromeOptions_ChromeBrowser {
	
	//You want to control the speed of your code
	//FASTER, SLOWER, NORMAL(6.277 seconds)
	
	//You can maximize the browser 
	//you want to open your code in incognito mode
	//other things
	
	public WebDriver driver;
	public ChromeOptions options;
	
	@Test(invocationCount = 10)
	public void tutorialsNinjaLogin() {
		options = new ChromeOptions();
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL); //6.277 seconds
		//options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.EAGER); //5.583 seconds
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		driver = new ChromeDriver(options);
		
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		
	}

}
