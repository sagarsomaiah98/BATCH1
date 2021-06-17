package Rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read_Property {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Config\\Config.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String val= prop.getProperty("Browser");
		
		System.out.println(val);
		
	String path= System.getProperty("user.dir");
	//System.out.println(path);
	
	//System.out.println(System.getProperty("user.dir")+"\\src\\main\\java\\Config\\Config.properties");
		
		
		
		
		

	}

}
