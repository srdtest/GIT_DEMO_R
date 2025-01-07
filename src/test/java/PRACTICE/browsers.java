package PRACTICE;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browsers {
	public static WebDriver driver;
	
	public static WebDriver chrome() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public static WebDriver openfirefox() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public  static WebDriver openEdge() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
