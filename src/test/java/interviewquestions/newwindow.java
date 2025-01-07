package interviewquestions;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class newwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.switchTo().newWindow(WindowType.WINDOW);
driver.get("https://www.google.com");
String title = driver.getTitle();
System.out.println(title);
WebElement log = driver.findElement(By.id("hplogo"));
if(log.isDisplayed()) {
	System.out.println("google web page opened");
}
		
		
	}

}
