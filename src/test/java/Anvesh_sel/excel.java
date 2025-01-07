package Anvesh_sel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class excel {

	@Test
	public void excel() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Nihir\\OneDrive\\Desktop\\book.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	 Sheet sheet = wb.getSheet("Sheet1");
	 
	 int roocount = sheet.getLastRowNum();
	 
	 
	 for(int data=0; data<roocount;data++) {
		 Row r = sheet.getRow(data);
		 int cellcount = r.getLastCellNum();
		  for (int cel=0; cel<cellcount;cel++) {
	 
			  	Cell cell = r.getCell(cel);
			  	
		 }
		  System.out.println("");
		  
		
	}
}
}