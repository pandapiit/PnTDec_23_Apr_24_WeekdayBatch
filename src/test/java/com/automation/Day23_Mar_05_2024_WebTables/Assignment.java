package com.automation.Day23_Mar_05_2024_WebTables;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment {
	public WebDriver driver;
	
	//Assignment 1 - Print the Current Price of "Central Bank"
	
	@Test
	public void assignment1() {
		String companyName = "Central Bank";
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));
		List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));
		
		for(int i=0 ; i<companyNames.size() ; i++) {
			if(companyName.equals(companyNames.get(i).getText())) {
				System.out.println(companyNames.get(i).getText() + "------------ >" + currentPrices.get(i).getText());
				break;
			}
		}
 	}
	
	//Assignment 2 - Determine the Current price of the company present in the 1000th row
	
	@Test
	public void assignment2() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));
		List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));
		
		WebElement companyName = driver.findElement(By.xpath("//table[@class = 'dataTable']/tbody/tr[1000]/td[1]"));
		
		String name = companyName.getText();
		System.out.println(name);
		
		for(int i=0 ; i<companyNames.size() ; i++) {
			if(name.equals(companyNames.get(i).getText())) {
				System.out.println(companyNames.get(i).getText() + "------------ >" + currentPrices.get(i).getText());
				break;
			}
		}
		
	}
	
	//Assignment 3 - Print 5 rows of the Webtable with the company names all the values associated with it
	//1st - top 5 rows
	//2nd - bottom 5 rows
	//3rd - 5 rows anywhere in the middle
	
	@Test
	public void assignment3() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		List<WebElement> first5rows = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr[position() > 0 and position() <= 5]"));
		for(int i=0 ; i<first5rows.size() ; i++) {
			System.out.println(first5rows.get(i).getText());
		}
		
		System.out.println("**************************************************************************************************");
		
		List<WebElement> middle5rows = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr[position() > 95 and position() <= 100]"));
		for(int i=0 ; i<middle5rows.size() ; i++) {
			System.out.println(middle5rows.get(i).getText());
		}
		
        System.out.println("**************************************************************************************************");
		
		List<WebElement> last5rows = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr[position() > 1194 and position() <= 1199]"));
		for(int i=0 ; i<last5rows.size() ; i++) {
			System.out.println(last5rows.get(i).getText());
		}
		
	}
	
	//Assignment 4 - Choose any 5 companies of your choice- Get their respective prices
	
	@Test
	public void assingment4() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		String[] selectedCompanies = {"Central Bank", "Ram Info", "HLV L", "UCO Bank", "CSB Bank"};
		
		List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));
		List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));
		
		for(int i= 0 ; i<companyNames.size() ; i++) {
			for( String companyName : selectedCompanies) {
				if(companyName.equals(companyNames.get(i).getText())) {
					System.out.println(companyNames.get(i).getText() + "----------> " + currentPrices.get(i).getText());
					break;
				}
				
			}
		}
		
	}
	
	

}
