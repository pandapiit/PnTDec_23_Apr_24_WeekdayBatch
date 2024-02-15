package com.automation.Day18_Feb_14_2024_Wait_Selenium_Extra_Topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handling_Frames {

	public WebDriver driver;
	
	@Test
	public void managingFrames() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		
		//Find out total no of frames
		//html tag of frames is iframe
		
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of frames in rediff home page is : " + allFrames.size());
		
		//there are 8 frames. 
		
		//Let's say there is a button which is not clicking directly because it is under a frame. So first we have to handle the frame
		
		driver.switchTo().frame(5);
		//the webelement has some class or some id
		//driver.findElement(By.id("something")).click();
		
		//you have to come back to your normal position
		driver.switchTo().defaultContent(); 
	}

}
