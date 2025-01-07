package PRACTICE;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.*;

public class pom {

	
	
	WebDriver driver;
	@FindBy(id="search")
	WebElement searchTextBox;
	@FindBy(name="searchBtn")
	WebElement searchButton;
	
	 public pom(WebDriver driver)
	{
	this.driver = driver; //initElements method to initialize all elements
	PageFactory.initElements(driver, this);
	}
	//Sample method
	public void search(String searchTerm)
	{
	searchTextBox.sendKeys(searchTerm); 
	searchButton.click();
	}
}
