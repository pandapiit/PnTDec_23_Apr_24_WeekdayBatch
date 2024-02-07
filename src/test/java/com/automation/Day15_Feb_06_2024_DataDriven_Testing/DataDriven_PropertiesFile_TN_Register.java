package com.automation.Day15_Feb_06_2024_DataDriven_Testing;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataDriven_PropertiesFile_TN_Register {
	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	
	
	@Test
	public void readRegisterDataFromPropertiesFile() throws Exception {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\automation\\Day15_Feb_06_2024_DataDriven_Testing\\config_Register.properties");
		prop.load(ip);
		
		registerCode();
	}
	

	
	public void registerCode() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
		driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a+ul>li:nth-child(1)>a")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(prop.getProperty("telephone"));
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(prop.getProperty("confirmPassword"));
		driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div.form-group>div>label:nth-child(1)>input")).click();
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	public void registerAccountWithoutEnteringAnyDetails() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualPrivacyPolicyWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedPrivacyPolicyWarningMessage = prop.getProperty("privacyPolicyWarningMessage");
		Assert.assertTrue(actualPrivacyPolicyWarningMessage.contains(expectedPrivacyPolicyWarningMessage));
		
		
		
	}

}
