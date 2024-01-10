package com.java.Day7_Jan_9_2024_ControlStatements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Switch_Statement {

	public static void main(String[] args) {
		// switch statement is a multi-way branch statement
		// switch statements defines multiple paths of execution of a program
		// switch statement provides better alternative than a large series of if-else
		// statements
		
		anotherSwitchExample();
		anotherSwitchExample1();

		switch ("Browser Configurate With Selenium")// the variable to be tested. This variable could be an
													// int/String/char)
		{
		case "Chrome":
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://google.com");
			break;
		case "Firefox":
			WebDriver driver1 = new FirefoxDriver();
			driver1.manage().window().maximize();
			driver1.get("https://rediff.com");
			break;
		case "Edge":
			WebDriver driver2 = new EdgeDriver();
			driver2.manage().window().maximize();
			driver2.get("https://flipkart.com");
			break;

		default:
			WebDriver driver3 = new InternetExplorerDriver();
			driver3.manage().window().maximize();
			driver3.get("https://bestbuy.com");
			break;

		}

	}
	
	
	public static void anotherSwitchExample1() {
		char someCharacter = 'a';
		
		switch(someCharacter) {
		
		case 'b':
			System.out.println('b');
			break;
		case 'e':
			System.out.println('e');
			break;
		case 'c':
			System.out.println('c');
			break;
		// Default case statement
		default:
			System.out.println("Not in 'e' or 'b' or 'c' ");
		}
	}
		
	{
	}

	public static void anotherSwitchExample() {

		// Declaring a variable for switch expression
		int number = 20; // this has been initialized. This is meaningful
		// Switch expression
		switch (number) {
		// Case statements
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
			break;
		case 30:
			System.out.println("30");
			break;
		// Default case statement
		default:
			System.out.println("Not in 10, 20 or 30");
		}
	}

	{

	}
}
