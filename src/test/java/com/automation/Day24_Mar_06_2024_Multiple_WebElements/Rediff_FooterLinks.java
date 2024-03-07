package com.automation.Day24_Mar_06_2024_Multiple_WebElements;

import java.io.IOException;
import java.util.List;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Rediff_FooterLinks {
	public WebDriver driver;
	
	@Test
	public void clickOnEachFooterLinkComebackAndClickOnNextLinkAndUseStatusCodeAs200() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		List<WebElement> footerLinks = driver.findElements(By.cssSelector("div.footer.alignC > a"));
		
		for(int i= 0 ; i<footerLinks.size(); i++) {
			String url = footerLinks.get(i).getAttribute("href");
			
			System.out.println(footerLinks.get(i).getText() + "-----" + url);
			Thread.sleep(2000);
			
			//validate the response code is 200, then only do the click operation
			
	
			boolean result = validateResponseCode(url);
			Assert.assertTrue(result, "invalid response code");
			
			footerLinks.get(i).click();
			System.out.println("The title of the current page : " + driver.getTitle());
			
			//driver.navigate().back();
			driver.get("https://rediff.com");
			
			footerLinks = driver.findElements(By.cssSelector("div.footer.alignC > a"));
			
			Thread.sleep(2000);
			
		}
	}
	
	
	public boolean validateResponseCode(String url) throws ClientProtocolException, IOException {
		//What is the responseCode that we expect == 200
		
		int responseCode = 0;
		responseCode = Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
		if(responseCode == 200) {
			return true;
		}
		return false;
	}

}
