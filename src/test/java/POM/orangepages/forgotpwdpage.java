package POM.orangepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POM.orange.basetest;

public class forgotpwdpage extends basetest {
	WebDriver driver;
	@FindBy(xpath="//p[text()='Forgot your password? ']")
	WebElement forgotlink;
	
	public forgotpwdpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public resetpasswordpage clickonforgotpqwdlink() {
		forgotlink.click();
		return new resetpasswordpage(driver);
	}

}
