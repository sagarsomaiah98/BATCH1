package Rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read_Property {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//FileInputStream fis= new FileInputStream("D:\\JANBASK\\BATCH 1\\BDD_FRAMEWORK\\src\\main\\java\\config\\config.properties");
		
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\config.properties");
		Properties prop= new Properties();
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));
		
	//	System.out.println(System.getProperty("user.dir"));

	}

}
