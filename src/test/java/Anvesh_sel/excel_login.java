package Anvesh_sel;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class excel_login {

	
	@Test
	public void login() throws EncryptedDocumentException, IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		FileInputStream fis = new FileInputStream("C:\\Users\\Nihir\\OneDrive\\Desktop\\book.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	
		Sheet sheet = wb.getSheet("Sheet2");
		

		int rowcount = sheet.getLastRowNum();
		
		for (int rn = 1; rn <= rowcount; rn++) {
			 {
				String un = sheet.getRow(rn).getCell(1).getStringCellValue();
				String pwd = sheet.getRow(rn).getCell(2).getStringCellValue();
				driver.findElement(By.name("username")).sendKeys(un);
				driver.findElement(By.name("password")).sendKeys(pwd);
				System.out.print("username is "+un);
				System.out.println("pasword is "+ pwd);
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//button[text()=\" Login \"]")).click();
				
		 }
	 }
	 
	 
	 
	}
}
