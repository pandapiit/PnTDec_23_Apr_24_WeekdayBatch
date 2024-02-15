package com.automation.Day18_Feb_14_2024_Mouse_Keyboard_Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_Actions {
	// Click and Hold
	// Click and Release
	// context click - Right Click
	// Back Click
	// Forward Click
	// Double Click
	// Move to Element
	// Move by offset
	// Drag and Drop

	public WebDriver driver;
	public ChromeOptions options;

	@Test(priority = 1)
	public void mouseActionsOperations() {
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://easemytrip.com");

		Actions actions = new Actions(driver);
		

		WebElement loginOrSignupButton = driver.findElement(By.cssSelector("a._btnclick > span"));
		actions.moveToElement(loginOrSignupButton).perform();

		WebElement customerLoginOption = driver.findElement(By.cssSelector("span#shwlogn > span:nth-child(1)"));
		actions.moveToElement(customerLoginOption).click().build().perform();

	}

	@Test(priority = 2)
	public void mouseActionsOperationsDraggable() {
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		
		Actions actions = new Actions(driver);
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		System.out.println(totalFrames.size());
		
		driver.switchTo().frame(0);
		WebElement dragElement = driver.findElement(By.id("draggable"));
		actions.dragAndDropBy(dragElement, 300, 0).build().perform();
		
	}
	
	@Test(priority = 1)
	public void mouseActionsOperationsDragAndDrop() {
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		Actions actions = new Actions(driver);
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		System.out.println(totalFrames.size());
		
		driver.switchTo().frame(0);
		
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(source, destination).build().perform();
		
	}

}