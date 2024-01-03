package com.automation.Day5_Jan_2_2024_UnderstandingDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Code_Step_by_Step {
	//Step 1 - Open the website https://tutorialsninja.com/demo
    //Step 2- Click on MyAccount
	//Step 3 - Click on Register
	//Step 4 - Enter firstname, Enter lastname, Enter email, Enter telephone, Enter password, Enter confirmpassword
	//         Check on privacy policy checkbox, Click on continue button

	public static void main(String[] args) {
		
		//Step 1 code
		WebDriver driver = new ChromeDriver();  //Ctrl+Shift+O
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		//Step 2 - Click on MyAccount
        //to make this work we have to learn Locators in Selenium
		//there were 8 locators and even today in Selenium4 these 8 locators are still the most important locators
		
		//id
		//class
		//name
		//linktext - the html tag is generally a (anchor)
		//partiallinktext
		//tagname
		//xpath
		//cssSelector
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

}
