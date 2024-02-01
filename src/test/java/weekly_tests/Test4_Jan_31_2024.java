package weekly_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test4_Jan_31_2024 {
	
	public WebDriver driver;
	
	@Test
	public void answer1() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//getTitle
		//getCurrentUrl
		
		WebElement usernameTextBox = driver.findElement(By.id("user-name"));
		if(usernameTextBox.isDisplayed()) {
			usernameTextBox.sendKeys("standard_user");
		}else {
			System.out.println("the textbox is not visible");
		}
		
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		if(passwordTextBox.isDisplayed()) {
			passwordTextBox.sendKeys("secret_sauce");
		}else {
			System.out.println("the textbox is not visible");
		}
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		if(loginButton.isDisplayed()) {
			loginButton.click();
		}else {
			System.out.println("the button is not visible");
		}
		
	}

}
