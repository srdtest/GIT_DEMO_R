package PRACTICE;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

public class testdatepicker {
	public static WebDriver driver;

	@BeforeMethod
	public void startbrowser() {
		driver = browsers.chrome();
	}

	@Test
	public void selectDataUtil() throws InterruptedException {
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     Thread.sleep(5000);
	     
	     
	    try {
	        driver.findElement(By.xpath("//input[@id='hp-widget__depart']")).click();
	        Thread.sleep(2000);
	        Date sampleDate = new Date(); // Initializing the date object with the current date 
	        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM yyyy");
	        String date = formatter.format(sampleDate); // formatting the date object in dd-MMM yyyy format
	        String splitter[] = date.split("-");
	        String monthYear = splitter[1]; // storing the month and year concatenated string excluding the day number
	        String day = splitter[0]; // storing the day number in the current date
	        System.out.println(monthYear);
	        System.out.println(day);

	        selectDate(monthYear,day); // function invocation
	        Thread.sleep(3000);
	    }
	        finally {
		    	 System.out.println("finally");
		     }
	}
	     
	     public void selectDate(String monthYear, String selectday) throws InterruptedException
	        { 
	           List<WebElement> elements = driver.findElements(By.xpath("//div[@class='ui-datepicker-title']/span[1]"));
	           for (int i=0; i<elements.size();i++)
	           {
	              System.out.println(elements.get(i).getText());
	              //Selecting the month
	              if(elements.get(i).getText().equals(monthYear))
	              {
	                 //Selecting the date 
	                 List<WebElement> days = driver.findElements(By.xpath("//div[@class='ui-datepicker-inline ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-datepicker-multi ui-datepicker-multi-2']/div[2]/table/tbody/tr/td/a"));
	                 for (WebElement d:days)
	                 { 
	                    System.out.println(d.getText());
	                    if(d.getText().equals(selectday))
	                    {
	                       d.click();
	                       Thread.sleep(10000);
	                       return;
	                    }
	}
	              }
	           }
} 
	    }

	

