
public class Excel_Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Xls_Reader xls= new Xls_Reader("D:\\JANBASK\\BATCH 1\\Excel_Read\\src\\main\\resources\\TestData\\TESTSUITE.xlsx");
		
	int row=	xls.getRowCount("GMAIL");
	
	System.out.println(row);
	
	
	
	for(int i=0;i<row;i++) {
		
		String val= xls.getCellData("GMAIL", i, 2);
		System.out.println(val);
		
		
	}
	
	
	
	xls.addColumn("GMAIL", "COMMENTS");

	}

}
