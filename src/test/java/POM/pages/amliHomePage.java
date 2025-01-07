package POM.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POM.baseclass;

public class amliHomePage extends baseclass {
	WebDriver driver;
	
	@FindBy(xpath ="//a[text()=\"Floor Plans & Pricing\"]")
	WebElement floor;
	
	public  amliHomePage(WebDriver driver) {
		super(driver);
	    
		PageFactory.initElements(driver, this);
		
	}
	public void clickonfloorplans() {
		floor.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
	}

}
