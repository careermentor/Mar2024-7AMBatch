package basicJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class FileHandling
{
	
	public static void readprop() throws Exception
	{
		//File f = new File("./DataFolder/testdata.properties");  //file connection
		FileReader fr = new FileReader("./DataFolder/testdata.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		
		System.out.println(prop.get("automation"));
		
		System.out.println(prop.get("browser"));
		
	}
	
	public static void writeFile() throws Exception
	{
		File f = new File("./DataFolder/xyz.txt");  //file connection
		
		FileWriter fw = new FileWriter(f,true);
		fw.write("\nthis is forth line");
		fw.flush();
		fw.close();
	
	}
	
	
	public static void readfile() throws Exception
	{
		//File f = new File("C:\\Users\\Santosh\\Desktop\\abc.txt");  //file connection
		
		FileReader fr = new FileReader("./DataFolder/abc.txt");
		
		int r = fr.read();  //t=116, h=104
		
		
		while(r!=-1)  
		{
			System.out.print((char) r);
			r = fr.read(); //h
			
		}
		
			
	}
	
	public static void main(String[] args) throws Exception 
	{
		FileHandling.readprop();
	}
	
}
