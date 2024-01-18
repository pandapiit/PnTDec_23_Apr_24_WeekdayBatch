package online_Students_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tamanna_Begaum_Code {

	public WebDriver driver;

	@BeforeMethod
	public void openWebsite() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https:/tutorialsninja.com/demo");
	}

	@Test
	public void RegisterTestWithemptyFirstName() {
	driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
	driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a+ul>li:nth-child(1)>a")).click();
	//driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
	driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
	driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda111@gmail.com");
	driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
	driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div.form-group>div>label:nth-child(1)>input")).click();
	driver.findElement(By.cssSelector("a.agree+input")).click();
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}
	@Test
	public void RegisterTestWithemptyLastname() {
	driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
	driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a+ul>li:nth-child(1)>a")).click();
	driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
	//driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
	driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda111@gmail.com");
	driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
	driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div.form-group>div>label:nth-child(1)>input")).click();
	driver.findElement(By.cssSelector("a.agree+input")).click();
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	@Test
	public void RegisterTestWithNotselectingagree() {
	driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
	driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a+ul>li:nth-child(1)>a")).click();
	driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
	driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
	driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda111@gmail.com");
	driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
	driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div.form-group>div>label:nth-child(1)>input")).click();
	//driver.findElement(By.cssSelector("a.agree+input")).click();
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	public void RegisterTestWithNotgivingTelephoneNumber() {
	driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
	driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a+ul>li:nth-child(1)>a")).click();
	driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
	driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
	driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda111@gmail.com");
	//driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
	driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div.form-group>div>label:nth-child(1)>input")).click();
	driver.findElement(By.cssSelector("a.agree+input")).click();
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

	@AfterMethod
	public void ClosingWebsite() {
	driver.close();
	}


	}
