package PRACTICE;



	import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; 
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
	public class WindowHandle_Demo { 
	  public static void main(String[] args) throws Exception {

	     
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     // Loading the website
	     driver.get("http://www.interviewbit.com/");
	     
	     Thread.sleep(3000);
	     String parent=driver.getWindowHandle(); // storing the parent window name as a string 
	    driver.findElement(By.xpath("(//span[@class='icon-chevron-down'])[3]")).click();
	     // Iterating over the list elements one by one and clicking all the links to open new child windows
	     driver.findElement(By.id("header-dropdown-heading")).click();
	     Set<String> s = driver.getWindowHandles(); // Storing the list of all the child windows
	     Iterator<String> I1= s.iterator();
	     // Iterating over the list of child windows 
	     while(I1.hasNext())
	     {
	        String child_window=I1.next();
	        if(!parent.equals(child_window))
	        {
	           driver.switchTo().window(child_window);
	           System.out.println(driver.switchTo().window(child_window).getTitle());
	           driver.close();
	        }
	     }
	     
	     
	    
	   
	     //switch to the parent window
	     driver.switchTo().window(parent);
	  }
	}
