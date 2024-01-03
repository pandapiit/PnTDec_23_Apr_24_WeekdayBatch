package com.automation.Day4_Dec_27_2023_ArchitectureOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstAutomationProgram {

	public static void main(String[] args) {
		// We are using WebDriver to code in Selenium Automation
		// WebDriver is very important
		// Java is a case sensitive language
		
		
		//Macbook - Chrome (download and install), Firefox (download and install)
		//Windows - Chrome and Firefox (download and install)
		
		WebDriver driver = new ChromeDriver();
		
		//Ctrl + Shift + O - together
		//Command + Shift + O - together
		driver.manage().window().maximize();
		driver.get("https://flipkart.com/");
		driver.quit();
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://bestbuy.com");
		driver1.quit();
		
		WebDriver driver2 = new EdgeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://rediff.com");
		driver2.quit();
		
		//WebDriver driver3 = new SafariDriver();
		//driver3.manage().window().maximize();
		//driver3.get("https://costco.com");
		//driver3.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}


