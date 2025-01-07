package PRACTICE;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class asd {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
 
		
		WebDriver driver = new ChromeDriver();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	
	WebElement  draggable = driver.findElement(By.id("draggable"));
	WebElement  droppable = driver.findElement(By.id("droppable"));
	
	Actions a = new Actions(driver);
	a.clickAndHold(draggable).perform();
	a.moveToElement(droppable).release().build().perform();
	a.contextClick().perform();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	
r.keyPress(KeyEvent.VK_DOWN);
	

driver.switchTo().newWindow(WindowType.WINDOW);
}
}
