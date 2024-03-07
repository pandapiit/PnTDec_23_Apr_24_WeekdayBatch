package com.automation.Day24_Mar_06_2024_Multiple_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart {
	
	public WebDriver driver;
	
	@Test
	public void flipkartMensTShirts() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/mens-tshirts/pr?sid=clo,ash,ank,edy&fm=neo%2Fmerchandising&iid=M_997b5166-26c1-48ef-9c4a-ded12a36c4fb_1_372UD5BXDFYS_MC.IF56C41VGEYS&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2527s%2BTop%2BWear~Men%2527s%2BT-Shirts_IF56C41VGEYS&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L2_view-all&cid=IF56C41VGEYS");
		
		List<WebElement> name = driver.findElements(By.cssSelector("div._2WkVRV"));
		List<WebElement> description = driver.findElements(By.cssSelector("a.IRpwTa"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class = '_30jeq3']"));
		List<WebElement> discount = driver.findElements(By.xpath("//div[@class = '_3Ay6Sb']"));
		
		for(int i=0 ; i<name.size() ; i++) {
			System.out.println(name.get(i).getText() + "----" + description.get(i).getText() + "---- " + price.get(i).getText() + "----" + discount.get(i).getText());
		}
	}

}
