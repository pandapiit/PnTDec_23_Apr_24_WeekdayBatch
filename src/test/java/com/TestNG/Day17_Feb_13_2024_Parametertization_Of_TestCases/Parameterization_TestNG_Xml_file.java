package com.TestNG.Day17_Feb_13_2024_Parametertization_Of_TestCases;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_TestNG_Xml_file {
	
public WebDriver driver;

//url
//email
//password
	
	
	@Test(priority = 1)
	@Parameters({"url", "email", "password"})
	public void loginTNParameterizationConcept(String url, String email, String password) {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed()); 
		
	}
	

	//firstname
	//lastname
	//telephone
	//password
	//confirmpassword
	
	@Test(priority = 2)
	@Parameters({"firstname", "lastname", "telephone", "passwordR", "confirmpasswordR"})
	public void registerTNParameterizationConcept(String firstname, String lastname, String telephone, String passwordR, String confirmpasswordR) {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(firstname);
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(lastname);
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(getEmailDateTimeStamp()); 
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(telephone);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(passwordR);
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(confirmpasswordR);
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[text() = 'Congratulations! Your new account has been successfully created!']")).isDisplayed());
		driver.quit();	
		
	}
	
	public String getEmailDateTimeStamp() {
		Date date = new Date();
		String timeStamp = date.toString().replace( " ", "_").replace(":", "_");
		return "seleniumpanda" + timeStamp + "@gmail.com";
	}
	
	

}
