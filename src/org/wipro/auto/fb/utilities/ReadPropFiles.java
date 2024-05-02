package org.wipro.auto.fb.utilities;


import java.io.FileReader;
import java.util.Properties;

public class ReadPropFiles 
{

	public static String readconfig(String key) throws Exception
	{
		FileReader fr = new FileReader("./DataFolder/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		
	}
	
	public static String readelement(String key) throws Exception
	{
		FileReader fr = new FileReader("./DataFolder/element.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		
	}
	
}
