package com.automation.Day11_Jan_23_2024_New_Browser_Window_Tab_In_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New_Tab_New_Window {
	
	public WebDriver driver;
	
	@Test
	public void openNewTab() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://rediff.com"); //this also means get me all the WebElements of this webpage
		//WebDriver will acknowledge all the WebElements to load
		
		
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://costco.com");
		//I want to navigate back to rediff
		driver.navigate().to("https://rediff.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://flipkart.com");
		driver.navigate().to("https://rediff.com");
		driver.findElement(By.className("signin")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		
		//driver.get("url"); this is opening the browser
		//driver.navigate().to("url"); //this is also opening the browser
		
		//so what is the difference ???
		
	
		
	}
	
	
	@Test
	public void howToUseClear() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.className("signin")).click();
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("login1")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda1@rediffmail.com");
	}

}
