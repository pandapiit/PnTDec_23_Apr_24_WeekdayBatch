package com.TestNG.Day16_Feb_07_2024_DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleTestCases_MultipleDataProviders_SameClass {
	
public WebDriver driver;
	
	@Test(dataProvider = "getTNLoginData", priority = 1)
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
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		driver.quit();
	}
	
	@Test(dataProvider = "getTNRegisterData", priority = 2)
	public void registerTest(String firstName, String lastName, String email, String telephone, String password, String confirmPassword) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
		driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a+ul>li:nth-child(1)>a")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(firstName);
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(lastName);
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(email);
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(telephone);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(confirmPassword);
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[text() = 'Congratulations! Your new account has been successfully created!']")).isDisplayed());
		driver.quit();
	}
	
	
	@DataProvider
	public Object[][] getTNRegisterData() {
		Object[][] data = { {"Selenium", "Panda", "seleniumpanda2343@gmail.com", "123456789", "Selenium@123", "Selenium@123"},
				            {"Selenium", "Panda", "seleniumpanda2355@gmail.com", "123456789", "Selenium@123", "Selenium@123"}};
		
		return data;
				            
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
