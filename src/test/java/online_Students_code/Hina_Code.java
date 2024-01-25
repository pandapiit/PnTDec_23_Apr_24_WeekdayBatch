package online_Students_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hina_Code {
	public WebDriver driver;
	@BeforeMethod
	public void openWebsite() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo");
	//title and page had to be validated
	//2 webelements
	}
	@Test
	public void loginTestWithValidEmailAddress() {
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.cssSelector("input#input-email")).sendKeys("YourMommy@gmail.com");
	driver.findElement(By.cssSelector("input#input-password")).sendKeys("YourMother");
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	//title and page had to be validated
	//2 webelements
	}
	@Test
	public void loginTestWithInvalidEmailAddress() {
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.cssSelector("input#input-email")).sendKeys("YourMommy@gmail.com");
	driver.findElement(By.cssSelector("input#input-password")).sendKeys("YourMother");
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	//title and page had to be validated
		//2 webelements
	}
	@Test
	public void loginTestWithValidEmailAddressInvalidPassword() {
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.cssSelector("input#input-email")).sendKeys("YourMommy@gmail.com");
	driver.findElement(By.cssSelector("input#input-password")).sendKeys("YourMother");
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	//title and page had to be validated
		//2 webelements
	}
	@AfterMethod
	public void closeTheWebsite() {
	driver.quit();
	}
}