package com.TestNG.Day16_Feb_07_2024_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_TutorialsNinjaRegister {
	
	public WebDriver driver;
	
	@Test(dataProvider = "getTNRegisterData")
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
	}
	
	
	@DataProvider
	public Object[][] getTNRegisterData() {
		Object[][] data = { {"Selenium", "Panda", "seleniumpanda234@gmail.com", "123456789", "Selenium@123", "Selenium@123"},
				            {"Selenium", "Panda", "seleniumpanda235@gmail.com", "123456789", "Selenium@123", "Selenium@123"}};
		
		return data;
				            
		}

}
