package interviewquestions;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JAVASCRIPT {

	
	@Test
	public void js() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amli.com/apartments/dallas/las-colinas-apartments/amli-at-escena");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,560)");
		
	}
	
}
