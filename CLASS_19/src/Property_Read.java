import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Property_Read {
	
	@Test
	
	public void read() throws IOException {
		FileInputStream fis= new FileInputStream("D:\\JANBASK\\BATCH 1\\CLASS_19\\src\\Config.properties");
		
		Properties prop =new Properties();
		prop.load(fis);
		
		System.out.println(prop.getProperty("uname"));
		System.out.println(System.getProperty("user.dir"));
		
		
		
	}

}
