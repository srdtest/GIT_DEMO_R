package POM.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POM.baseclass;

public class floorPlanspage extends baseclass{
	WebDriver driver;
	@FindBy(xpath="//span[text()='Bedrooms']")
	WebElement downarrow;
	@FindBy(xpath="//input[@value='2 Bedrooms']")
	WebElement bedrooms2;

	 
			
	
	public floorPlanspage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	public void slectbedrooms() {
		downarrow.click();
		bedrooms2.click();
	}
	
}
