package Anvesh_sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class autoIT {
	WebDriver driver= new ChromeDriver();
	
	@Test
	public void autoit() throws IOException {
		
		driver.get("https://smallpdf.com/pdf-converter?mu=b5Vg&utm_campaign=20926214370&utm_source=google&utm_medium=cpc&gad_source=1&gclid=Cj0KCQjwzva1BhD3ARIsADQuPnXCLQT4HEYCj95nn8skfahpgkywUaLRZXjLfUpPm8X75iaAbwHkXMoaAr37EALw_wcB");
		driver.findElement(By.xpath("//span[text()=\"Choose Files\"]")).click();
		String execpath ="C:\\Users\\Nihir\\OneDrive\\Desktop\\autoit\\auto.au3";
		
		Runtime.getRuntime().exec(execpath);
		ProcessBuilder.startPipeline(null);
		
		
		
		
	}

}
