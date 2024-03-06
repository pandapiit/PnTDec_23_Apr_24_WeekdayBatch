package com.automation.Day23_Mar_05_2024_Dynamic_Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggestive_Dropdown {
	public WebDriver driver;
	
	@Test
	public void easeMyTrip() {
		//homework
	}
	
	@Test
	public void makeMyTripAutoSuggestiveDropdown() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys("New");
		
		//Let's say we want to select New York - JFKennedy airport and it is getting highlighted at the 5th Down array key
		
		int i=0;
		while(i<5) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.DOWN);
			i++;
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		driver.findElement(By.id("toCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys("Las");
		
		//Let's say we want to select Las Pierdas - Venezuela airport and it is getting highlighted at the 5th Down array key
		int j=0;
		while(j<5) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys(Keys.DOWN);
			j++;
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys(Keys.ENTER);
	}

}
