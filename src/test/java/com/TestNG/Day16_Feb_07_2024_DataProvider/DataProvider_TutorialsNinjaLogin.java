package com.TestNG.Day16_Feb_07_2024_DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_TutorialsNinjaLogin {
	
	public WebDriver driver;
	
	@Test(dataProvider = "getTNLoginData")
	public void loginTest(String email, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
	}
	
	@DataProvider
	public Object[][] getTNLoginData() {
		Object[][] data = { {"seleniumpanda@gmail.com" , "Selenium@123"},
				            {"seleniumpanda1@gmail.com", "Selenium@123"},
				            {"seleniumpanda2@gmail.com", "Selenium@123"},
				            {"seleniumpanda3@gmail.com", "Selenium@123"},
				            {"seleniumpanda4@gmail.com", "Selenium@123"},
				            {"seleniumpanda5@gmail.com", "Selenium@123"},
				            {"seleniumpanda6@gmail.com", "Selenium@123"},
				            {"seleniumpanda7@gmail.com", "Selenium@123"},
				            {"seleniumpanda8@gmail.com", "Selenium@123"},
				            {"seleniumpanda9@gmail.com", "Selenium@123"}};
		
		return data;
				            
		}
	}


