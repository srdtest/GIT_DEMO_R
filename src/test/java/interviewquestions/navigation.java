package interviewquestions;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class navigation {

	@Test
	public void naviagation() throws InterruptedException {
		WebDriver driver  = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.findElement(By.name("q")).sendKeys(Keys.F5);
		Dimension d = new Dimension(100,500);   
		driver.manage().window().setSize(d); 
		Point p = new Point(100,500);
		driver.manage().window().setPosition(p);
		driver.manage().window().wait(2000);
	
		

	}
}
