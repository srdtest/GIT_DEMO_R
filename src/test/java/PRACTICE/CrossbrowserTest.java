package PRACTICE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert;



public class CrossbrowserTest {
	WebDriver driver = null;

	@Parameters("browser")
	@Test
	public void launchbrowser(String br) {
		
		if(br.equals("FF")) {
			driver=new ChromeDriver();
		}
		if(br.equals("edge")) {
			driver=new EdgeDriver();
		}
		if(br.equals("CH")) {
			driver=new FirefoxDriver();
		}
		driver.get("https://www.interviewbit.com/selenium-interview-questions/");
	}
	
	@Test
	public void verifyTitle() {
		Assert.assertEquals(driver.getTitle(), "selenium-interview-questions/");
		
		
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}
