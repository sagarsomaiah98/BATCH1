import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	public static void main(String[] args) throws IOException {
		
		
		
		FileInputStream fis	= new FileInputStream("D:\\JANBASK\\BATCH 1\\Class_19A\\src\\Config.properties");
			
		
		
		Properties prop= new Properties();//create object of class properties
		prop.load(fis); // pass the file name
		String brows=prop.getProperty("Browser"); // read the property
		String url=prop.getProperty("url");
	     String timeout=prop.getProperty("timeout");
	     String testdatapath=prop.getProperty("testdatapath");
		System.out.println(brows);
		System.out.println(url);
		System.out.println(timeout);
		System.out.println(testdatapath);

	}

}
