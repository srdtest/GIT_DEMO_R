package Anvesh_sel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class assignment_windows {
	WebDriver driver = new ChromeDriver();
	@Test
	public void getwindows() throws InterruptedException {
		driver.get("https://www.abhibus.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=\"Login/SignUp\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=\"Sign in with google\"]")).click();
		driver.close();
		Thread.sleep(3000);
		Set<String> s = driver.getWindowHandles();
		System.out.println(s.size());
		Iterator<String> itr = s.iterator();
	//	itr.next();
		String google =itr.next();
		driver.switchTo().window(google);
	
		driver.findElement(By.id("identifierId")).sendKeys("srdf@gmail.com");
		
		
	}

}
