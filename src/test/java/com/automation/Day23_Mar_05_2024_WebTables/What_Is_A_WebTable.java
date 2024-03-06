package com.automation.Day23_Mar_05_2024_WebTables;

public class What_Is_A_WebTable {
	
	//It is a dynamic table which represents data in form of rows and cols
	
	//Criteria to work with Webtables - Very good Xpath knowledge or cssSelector knowledge
	
	//most of the time the html tag for a webtable will be table
	
	//The table has a class attribute known as dataTable
	//The table has a head and a body
	//The head is represented by thead
	//Here in this example the head has 1 row which is represented by the html tag tr
	//the row has few cols and these cols are represented by the html tag th
	
	//The body is represented by tbody
	//The rows are represented by tr
	//The cols are represented by td
	
	
	//table[@class = 'dataTable'] - this represents the whole Webtable
	//table[@class = 'dataTable']/thead - this represents the head of the Webtable
	//table[@class = 'dataTable']/thead/tr - this represents the row of the header
	//table[@class = 'dataTable']/thead/tr/th - this represents all the cols of the header row
	//table[@class = 'dataTable']/thead/tr/th[5] - this represents the 5th col of the header row
	//table[@class = 'dataTable']/thead/tr/th[3] - this represents the 3rd col of the header row

	
	//table[@class = 'dataTable']/tbody - this represents the body of the Webtable
	//table[@class = 'dataTable']/tbody/tr - represents all the rows of the body
	//table[@class = 'dataTable']/tbody/tr[1] - represents the first row of the body
	//table[@class = 'dataTable']/tbody/tr/td - represents all the cols of the body
	//table[@class = 'dataTable']/tbody/tr[1]/td[1] - represents the first col of the first row
	//table[@class = 'dataTable']/tbody/tr[9]/td[4] - represents 4th col of the 9th row
	//table[@class = 'dataTable']/tbody/tr/td[1] - represents all values in the 1st col of the body
	//table[@class = 'dataTable']/tbody/tr/td[4] - represents all value in the 4th col of the body
	
}
