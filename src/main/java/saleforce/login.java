package saleforce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	
	@Test
	public void loginapp() {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
