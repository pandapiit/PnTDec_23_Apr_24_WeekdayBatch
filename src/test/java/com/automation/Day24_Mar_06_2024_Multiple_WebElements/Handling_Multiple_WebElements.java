package com.automation.Day24_Mar_06_2024_Multiple_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handling_Multiple_WebElements {
	
	public WebDriver driver;
	
	@Test
	public void findingMultipleLinks() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bbc.com");
		
		//how to determine total number of links at that instant
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links present at this instant is : " + totalLinks.size()); //253 
		
		//What is the 101st link ? - stored inside 100th index position
		//Object type here is WebElement
		
		WebElement Link101 = totalLinks.get(100);
		System.out.println("The 101st link at this instant is : " + Link101);
		System.out.println("The name of this 101st link is : " + Link101.getText());
		
		//Every link WebElement has an attribute known as href. And href will store the url of that link
		//I want you all to determine the url present in Link101
		System.out.println("The url present in Link101 is : " + Link101.getAttribute("href"));
		
		//how to find x and y coordinate of this Link101?
		System.out.println(Link101.getLocation().x + "------------------------" + Link101.getLocation().y);
		
		//How to click on Link101
		//Link101.click();
		
		//print all the links present in the webpage with their respective names and also check if they are displayed or not
		
		for(int i=0 ; i<totalLinks.size() ; i++) {
			System.out.println(totalLinks.get(i).getText() + "------" + totalLinks.get(i).getAttribute("href") + "------------" + totalLinks.get(i).isDisplayed());
		}
		
		//driver.quit();
	}

}
