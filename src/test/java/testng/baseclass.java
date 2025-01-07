package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class baseclass {
	WebDriver driver;
	@Parameters({"browsername"})
	@BeforeClass
	public void launchbrowser(String browsername) {
		if(browsername.equals("chrome")) {
		 driver = new ChromeDriver();
	}
		else if(browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
	}
			
	@BeforeMethod
	public void launchapp() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@AfterClass
	public void closebrowser() {
		driver.close();
	}

}
