package online_Students_code;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Explain_Calling_Via_Object_Reference {
	
	
	
	@Test
	public void check() {
		ChromeDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
	}
	

}
