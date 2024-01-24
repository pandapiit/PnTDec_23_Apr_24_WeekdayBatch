package com.automation.Day11_Jan_23_2024_Cookies_Dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cookies {
	
	public WebDriver driver;
	
	@Test
	public void deleteCookies() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		
	}

}
