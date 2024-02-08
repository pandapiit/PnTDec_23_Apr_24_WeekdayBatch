package com.TestNG.Day16_Feb_07_2024_DataProvider;

import org.testng.annotations.DataProvider;

public class DataProviders_SeparateClass {
	
	//this class will only hold @DataProviders
	
	@DataProvider(name = "TNRegister")
	public Object[][] getTNRegisterData() {
		Object[][] data = { {"Selenium", "Panda", "seleniumpanda23433@gmail.com", "123456789", "Selenium@123", "Selenium@123"},
				            {"Selenium", "Panda", "seleniumpanda23553@gmail.com", "123456789", "Selenium@123", "Selenium@123"}};
		
		return data;
				            
		}

	
	@DataProvider(name = "TNLogin")
	public Object[][] getTNLoginData() {
		Object[][] data = { {"seleniumpanda@gmail.com" , "Selenium@123"},
				            {"seleniumpanda1@gmail.com", "Selenium@123"},
				            {"seleniumpanda2@gmail.com", "Selenium@123"},
				            {"seleniumpanda3@gmail.com", "Selenium@123"},
				            {"seleniumpanda4@gmail.com", "Selenium@123"},
				            {"seleniumpanda5@gmail.com", "Selenium@123"},
				            {"seleniumpanda6@gmail.com", "Selenium@123"},
				            {"seleniumpanda7@gmail.com", "Selenium@123"},
				            {"seleniumpanda8@gmail.com", "Selenium@123"},
				            {"seleniumpanda9@gmail.com", "Selenium@123"}};
		
		return data;
				            
		}


}
