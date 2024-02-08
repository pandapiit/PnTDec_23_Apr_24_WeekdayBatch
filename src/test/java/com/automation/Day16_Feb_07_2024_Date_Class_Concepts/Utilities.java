package com.automation.Day16_Feb_07_2024_Date_Class_Concepts;

import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Utilities {
	public WebDriver driver;
		
	@Test(invocationCount = 10)
	public void registerCodeWithEmailStyleUpdated() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
		driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a+ul>li:nth-child(1)>a")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(emailDateTimeStamp()); //we need to take care of this
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("123456789");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[text() = 'Congratulations! Your new account has been successfully created!']")).isDisplayed());
		driver.quit();	
	}

	@Test
	public String emailDateTimeStamp() {
		Date date = new Date();
		System.out.println(date);    // Wed Feb 07 22:21:27 EST 2024                  
		String timeStamp = date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(timeStamp);  //Wed_Feb_07_22_22_51_EST_2024
		return "seleniumpanda" + timeStamp + "@gmail.com";	
		
	}
	
	
	
	
	
	
	
	
	

}
