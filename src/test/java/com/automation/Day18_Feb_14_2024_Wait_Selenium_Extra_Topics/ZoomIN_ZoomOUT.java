package com.automation.Day18_Feb_14_2024_Wait_Selenium_Extra_Topics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZoomIN_ZoomOUT {
	
	public WebDriver driver;
	
	@Test
	public void zoomInZoomOut() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom = '300%' ;");
		
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom = '50%' ;");
		
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom = '100%' ;");
		
	}

}
