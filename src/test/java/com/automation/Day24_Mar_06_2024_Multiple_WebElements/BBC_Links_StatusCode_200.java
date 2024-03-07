package com.automation.Day24_Mar_06_2024_Multiple_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BBC_Links_StatusCode_200 {
	
	public WebDriver driver;
	
	@Test
	public void bbcStatusCodeValidateAndClick() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bbc.com");
		
		
		List<WebElement> headerLinks = driver.findElements(By.cssSelector("nav.sc-3ac2e8e0-9.ifXwIt > section > nav > ul > li"));
		
		for(int i=0 ; i<headerLinks.size() ; i++) {
			System.out.println(headerLinks.get(i).getText());
			Thread.sleep(1000);
			headerLinks.get(i).click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			headerLinks = driver.findElements(By.cssSelector("nav.sc-3ac2e8e0-9.ifXwIt > section > nav > ul > li"));
		}
	}

}
