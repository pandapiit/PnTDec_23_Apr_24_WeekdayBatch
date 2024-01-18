package com.automation.Day10_Jan_17_2024_ValidationTechniques_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_Validation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		//Title of the page - this is first validation we need to do
		String actualTitle = driver.getTitle(); //we know that the title is a String
		System.out.println(actualTitle); //this will print the title of this webpage
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		
		//CurrentUrl of the webpage - this is the second validation which we need to do
		String actualCurrentUrl = driver.getCurrentUrl();
		System.out.println(actualCurrentUrl);
		String expectedCurrentUrl = "https://www.rediff.com/";
		
		if(expectedTitle.equals(actualTitle) && expectedCurrentUrl.equals(actualCurrentUrl)) {
			driver.findElement(By.className("signin")).click();
		}else {
			System.out.println("The title and current url of Rediff Landing Page are incorrect");
		}
		
		
		
	
		

	}

}
