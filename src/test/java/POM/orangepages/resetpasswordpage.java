package POM.orangepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POM.orange.basetest;

public class resetpasswordpage extends basetest{
WebDriver driver;

public resetpasswordpage(WebDriver driver) {
	
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

@FindBy(name="username") WebElement username; 
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/div/form/div[2]/button[1]") WebElement cancelbutton;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/div/form/div[2]/button[2]") WebElement resetbutton;
@FindBy (xpath="//h6[text()='Reset Password link sent successfully']") WebElement text;
	
	public void resetpwd() {
		username.sendKeys("admin");
		resetbutton.click();
	}
	public String getthetext() {
		 String textmsg =text.getText();
		 return textmsg;
		
		
		
	}
	
	
	
}
