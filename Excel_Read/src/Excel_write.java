import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class Excel_write {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Workbook wb = new HSSFWorkbook();
	    FileOutputStream fileOut = new FileOutputStream("C:\\Documents and Settings\\sagar\\Desktop\\workbook.xls");
	    
	   
	    
	    Sheet sheet1 = wb.createSheet("new sheet");
	    Sheet sheet2 = wb.createSheet("second sheet");
	    
	    // Create a cell and put a value in it.
	    
	    
	    for(int i=0;i<10;i++){
	    	Row row = sheet1.createRow((short)i);
	    	for(int j=0;j<10;j++){
	    		
	    		
	    	
	    
	    Cell cell1 = row.createCell(j);
	    cell1.setCellValue("first  "+j);
	    /*Cell cell2 = row.createCell(1);
	    cell2.setCellValue("second");
	    Cell cell3 = row.createCell(2);
	    cell3.setCellValue("third");*/
	    }
	    }
	    wb.write(fileOut);
	    fileOut.close();

	}

}
