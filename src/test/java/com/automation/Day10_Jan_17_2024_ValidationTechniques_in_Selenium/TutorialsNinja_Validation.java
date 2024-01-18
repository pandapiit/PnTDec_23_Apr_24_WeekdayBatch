package com.automation.Day10_Jan_17_2024_ValidationTechniques_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinja_Validation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		//Validating the LandingPage
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle); //this is actually expectedTitle. You can delete this line once you get the value
		String expectedTitle = "Your Store";
		
		String actualCurrentUrl = driver.getCurrentUrl();
		System.out.println(actualCurrentUrl);
		String expectedCurrentUrl = "https://tutorialsninja.com/demo/";
		
		if(expectedTitle.equals(actualTitle) && expectedCurrentUrl.equals(actualCurrentUrl)) {
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
		}else {
			System.out.println("Title and CurrentUrl are incorrect");
		}
		
		//let's validate the LoginPage
		String actualLoginPageTitle = driver.getTitle();
		String expectedLoginPageTitle = "Account Login";
		
		String actualLoginPageCurrentUrl = driver.getCurrentUrl();
		String expectedLoginPageCurrentUrl = "https://tutorialsninja.com/demo/index.php?route=account/login";
		
		if(actualLoginPageTitle.equals(expectedLoginPageTitle) && actualLoginPageCurrentUrl.equals(expectedLoginPageCurrentUrl)) {
			driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();	
		}else {
			System.out.println("The title and current url of Login Page are incorrect");
		}

	}

}
