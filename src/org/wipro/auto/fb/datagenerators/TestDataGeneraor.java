package org.wipro.auto.fb.datagenerators;

import org.testng.annotations.DataProvider;

public class TestDataGeneraor 
{

	
	@DataProvider(name="staticdata")
	public Object[][] testdata()
	{
		//Object[] data1 = {"User1","user2","user3"};    ///1-D array
		Object[][] data = {{"User1","pass1"},{"User2","pass2"},{"User3","pass3"}};    ///1-D array
		return data;
	}
	
	@DataProvider(name="email or phone")
	public Object[] testdata1()
	{
		Object[] data1 = {"User1","1234567890"};    ///1-D array
		//Object[][] data = {{"User1","pass1"},{"User2","pass2"},{"User3","pass3"}};    ///1-D array
		return data1;
	}
	
}
