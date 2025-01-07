package POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import POM.pages.amliHomePage;
import POM.pages.floorPlanspage;

public class Amli  {
	
	static WebDriver driver;
	@Test(description = "this is the first testcase to select the 2 bedroom floor plan")
	public void clickonFloorplans() throws AWTException, InterruptedException {
		
		amliHomePage amli1 = new amliHomePage(driver);
		amli1.clickonfloorplans();
		floorPlanspage floor = new floorPlanspage(driver);
		floor.slectbedrooms();
		
	}

}
