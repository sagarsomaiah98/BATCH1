import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Read_Excel {
	
	
	
	

		public static void readXLSFile(String path) throws IOException
		{
			InputStream ExcelFileToRead = new FileInputStream(path);
			XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);
			
			XSSFWorkbook test = new XSSFWorkbook(); 
			
			XSSFSheet sheet = wb.getSheet("Sheet1");
			XSSFRow row; 
			XSSFCell cell;

			Iterator rows = sheet.rowIterator();

			while (rows.hasNext())
			{
				row=(XSSFRow) rows.next();
				Iterator cells = row.cellIterator();
				while (cells.hasNext())
				{
					cell=(XSSFCell) cells.next();
			
					 cell = row.getCell(0);
					if (cell != null) {
					 if (cell.getCellType() == CellType.STRING) {
					  System.out.println(cell.getStringCellValue());
					 }
					}//U Can Handel Boolean, Formula, Errors
					}
				}
				System.out.println();
			}
		
		
		
		
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readXLSFile("D:\\JANBASK\\BATCH 1\\Excel_Read\\src\\TestData\\Test Suite1.xlsx");
		
		
	}

}
