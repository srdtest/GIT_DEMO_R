package Anvesh_sel;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class amli {
	
	@Test
	public void bookamli() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amli.com/apartments/dallas/las-colinas-apartments/amli-at-escena");
		https://dearjob.org/#/jobseekerprofile
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Floor Plans & Pricing")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=\"Bedrooms\"]")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
	
	WebElement le = driver.findElement(By.xpath("//label[contains(text(),'2 Bedrooms')]"));
	Thread.sleep(2000);
	if(le.isEnabled()) {
		le.click();
	}
	
	
	
	
		}
		
	
	
	
	}


