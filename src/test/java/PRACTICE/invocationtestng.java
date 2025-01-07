package PRACTICE;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class invocationtestng {
	
	
	@Test(invocationCount=5)
	public void gettitle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.interviewbit.com/selenium-interview-questions/");
		System.out.println(driver.getTitle());
	}

}
