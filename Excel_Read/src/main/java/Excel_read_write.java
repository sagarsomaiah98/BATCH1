import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class Excel_read_write {
	
	@Test(priority=1)
	
	public void write() throws IOException {
		Workbook wb = new HSSFWorkbook();
		
		OutputStream fileOut = new FileOutputStream("D:\\JANBASK\\BATCH 1\\Excel_Read\\src\\main\\resources\\TestData\\workbook.xls");
		
		Sheet sheet1 = wb.createSheet("new sheet");
		Sheet sheet2 = wb.createSheet("second sheet");
		CreationHelper createHelper = wb.getCreationHelper();
		Row row; 
		Cell cell;
		
		
		
		
		for(int i=0;i<10;i++) {
			row=sheet1.createRow(i);
			row.createCell(0).setCellValue(i);
			row.createCell(1).setCellValue(
			     createHelper.createRichTextString(i+"  --This is a string"));
			row.createCell(2).setCellValue(true);
			
		}
		
		
		
		
		// Create a row and put some cells in it. Rows are 0 based.
		/*
		 * Row row; Cell cell; row = sheet1.createRow(0); cell = row.createCell(0);
		 * cell.setCellValue(0); row = sheet1.createRow(1); cell = row.createCell(0);
		 * cell.setCellValue(1); row = sheet1.createRow(2); cell = row.createCell(0);
		 * cell.setCellValue(2);
		 */
		
		/*
		 * for( int i=0;i<10;i++) { row = sheet1.createRow(i); cell = row.createCell(i);
		 * cell.setCellValue(i); }
		 */
	
		// Create a cell and put a value in it.
		
		
		    wb.write(fileOut);
	
	
		
		
	}
	
	@Test(priority=2)
	public void read() throws IOException {
		FileInputStream fis = new FileInputStream("D:\\JANBASK\\BATCH 1\\Excel_Read\\src\\main\\resources\\TestData\\workbook.xls");
		
Workbook wb = new HSSFWorkbook(fis);
		
		
		
		Sheet sheet=wb.getSheet("new sheet");
		int rowcount= sheet.getLastRowNum();
	System.out.println(rowcount);
		Row row;
		Cell cell;
		
		
		for( int i=0;i<rowcount;i++) {
			for( int j=0;j<rowcount;j++) {
			row=sheet.getRow(j);
			cell= row.getCell(i);
			if(cell==null)
				break;
			
			System.out.print(cell+" | ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}
	

}
