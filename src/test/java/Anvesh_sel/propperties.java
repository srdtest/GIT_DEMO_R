package Anvesh_sel;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class propperties {
	
@Test
public void proper() throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	FileInputStream fis = new FileInputStream("..//rahul_selenium/prop.properties");
	Properties proper = new Properties();
	proper.load(fis);
	String un=proper.getProperty("username");
	String pwd = proper.getProperty("password");
	System.out.println(un);
	System.out.println(pwd);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.name("username")).sendKeys(un);
	driver.findElement(By.name("password")).sendKeys(pwd);
	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	
	
}

}
