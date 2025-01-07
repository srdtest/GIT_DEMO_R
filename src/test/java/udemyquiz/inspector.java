package udemyquiz;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class inspector {

	@Test
	public void test() {
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		System.out.println(driver.findElement(By.xpath("//div[@class=\"login_logo\"]")).getText());
		driver.findElement(By.id("login-button")).click();
		
	}
}
