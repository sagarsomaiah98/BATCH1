import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Create_TextFile {
	
	
	public static void main(String[] args) throws IOException {
		//Create the file
		File file = new File("C:\\Users\\somai\\Desktop\\BATCH FILE\\testFile.txt");
		file.createNewFile();
		
		//Write to file
		
		FileWriter writer = new FileWriter(file);
		writer.write("Test dfd");
		writer.write("selenium");
		writer.close();
		
		//Read File
		
		 BufferedReader br = new BufferedReader(new FileReader(file));
		  
		  String st;
		  while ((st = br.readLine()) != null)
		    System.out.println(st);
		  }
		
		
		  
	
	}
	
	


