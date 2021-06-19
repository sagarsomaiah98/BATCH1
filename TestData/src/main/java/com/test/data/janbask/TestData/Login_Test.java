package com.test.data.janbask.TestData;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;

public class Login_Test {
	
	@Test
	public void Login() throws IOException {
		
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe"); WebDriver driver =
		 * new ChromeDriver();
		 * 
		 * driver.findElement(By.xpath("")).sendKeys("unam1");
		 * driver.findElement(By.xpath("")).sendKeys("pwd");
		 * driver.findElement(By.xpath("")).click();
		 */
		Workbook wb = new HSSFWorkbook();
		
		OutputStream fileOut = new FileOutputStream("C:\\Users\\somai\\Desktop\\TestData\\Test.xls") ;
		 
		    
		//Workbook wb = new XSSFWorkbook();
		CreationHelper createHelper = wb.getCreationHelper();
		Sheet sheet = wb.createSheet("new sheet");
		// Create a row and put some cells in it. Rows are 0 based.
		Row row = sheet.createRow(0);
		// Create a cell and put a value in it.
		Cell cell = row.createCell(0);
		cell.setCellValue(1);
		// Or do it on one line.
		row.createCell(1).setCellValue(1.2);
		row.createCell(2).setCellValue(
		     createHelper.createRichTextString("This is a string"));
		row.createCell(3).setCellValue(true);
		// Write the output to a file
		
		   // wb.write(fileOut);
		
		
		
		
				
		
		
	}

}
