package POM.orangepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POM.baseclass;
import POM.orange.basetest;

public class OrangeHRMLoginPage  {
	
	WebDriver driver;
	@FindBy (xpath="//input[@name='username']") WebElement username;
	@FindBy (xpath="//input[@name='password']") WebElement password;
	@FindBy (xpath="//button[text()=' Login ']") WebElement login;
	
	
	public OrangeHRMLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void login() {
		username.sendKeys("admin");
		password.sendKeys("admin123");
		login.click();
		
	}
}
