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
	}




	@Test
	public void RegisterTestWithValidEmailAddress() {
	driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
	driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>ul>li:nth-child(1)>a")).click();
	driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Yur");
	driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Mum");
	driver.findElement(By.cssSelector("input#input-email")).sendKeys("Yurmum@gmail.com");
	driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("1231231234");
	driver.findElement(By.cssSelector("input#input-password")).sendKeys("MaGee");
	driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("MaGee");
	driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div.form-group>div>label:nth-child(2)>input")).click();
	driver.findElement(By.cssSelector("a.agree+input")).click();
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}


	@Test
	public void RegisterTestWithInvalidEmailAddress() {
	driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
	driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>ul>li:nth-child(1)>a")).click();
	driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Yur");
	driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Mum");
	driver.findElement(By.cssSelector("input#input-email")).sendKeys("@Yurmum.gmail.com");
	driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("1231231234");
	driver.findElement(By.cssSelector("input#input-password")).sendKeys("MaGee");
	driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("MaGee");
	driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div.form-group>div>label:nth-child(2)>input")).click();
	driver.findElement(By.cssSelector("a.agree+input")).click();
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}





	@Test
	public void RegisterTestWithMissingLastName() {
	driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
	driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>ul>li:nth-child(1)>a")).click();
	driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Yur");
	driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(" ");
	driver.findElement(By.cssSelector("input#input-email")).sendKeys("Yurmum@gmail.com");
	driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("1231231234");
	driver.findElement(By.cssSelector("input#input-password")).sendKeys("MaGee");
	driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("PaGeee");
	driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div.form-group>div>label:nth-child(2)>input")).click();
	driver.findElement(By.cssSelector("a.agree+input")).click();
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}


	@Test
	public void RegisterTestWithInvalidTelephone() {
	driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
	driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>ul>li:nth-child(1)>a")).click();
	driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Yur");
	driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Mum");
	driver.findElement(By.cssSelector("input#input-email")).sendKeys("Yurmum@gmail.com");
	driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("12312312341231234");
	driver.findElement(By.cssSelector("input#input-password")).sendKeys("MaGee");
	driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("MaGee");
	driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div.form-group>div>label:nth-child(2)>input")).click();
	driver.findElement(By.cssSelector("a.agree+input")).click();
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}


	@Test
	public void RegisterTestWithInvalidPasswordConfirm() {
	driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
	driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>ul>li:nth-child(1)>a")).click();
	driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Yur");
	driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Mum");
	driver.findElement(By.cssSelector("input#input-email")).sendKeys("Yurmum@gmail.com");
	driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("1231231234");
	driver.findElement(By.cssSelector("input#input-password")).sendKeys("MaGee");
	driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("PaGeee");
	driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div.form-group>div>label:nth-child(2)>input")).click();
	driver.findElement(By.cssSelector("a.agree+input")).click();
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}




	@AfterMethod
	public void closeTheWebsite() {
	driver.quit();
	}

	}


