package Anvesh_sel;


import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class uniform {
WebDriver driver = new ChromeDriver();
	
	@Test
	public void uniformd() throws InterruptedException {
		driver.get("https://www.dennisuniform.com/collections/mi3498/products/dca-mg8420-830-ru9-035?grade=grade_k&gender=gender_boys&view=0.04200682350194551&variant=44048316924089");
		WebElement ele = driver.findElement(By.id("ProductSubmitButton-template--16944161816761__main"));
		driver.findElement(By.xpath("//button[text()=\"Youth \"]")).click();
		WebElement sele = driver.findElement(By.id("Option-template--16944161816761__main-1"));
		Select s= new Select(sele);
				Thread.sleep(12000);
		Set<String> se = driver.getWindowHandles();
		System.out.println(se.size());
		
		System.out.println("this is the modifiation");
		
	}

	
}
