package com.automation.Day10_Jan_17_2024_ValidationTechniques_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_WebElement_Validation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		//We want to click on Sign in link - isDisplayed(), isEnabled(), isSelected()
		
		WebElement signinlink = driver.findElement(By.className("signin"));
		if(signinlink.isDisplayed() && signinlink.isEnabled()) {
			signinlink.click();
		}else {
			System.out.println("The signinlink is not enabled or not displayed");
		}
		
		WebElement keepmesignedinCheckbox = driver.findElement(By.id("remember"));
		System.out.println(keepmesignedinCheckbox.isSelected()); //true

	}

}
