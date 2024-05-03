package org.wipro.auto.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.auto.fb.utilities.ReadPropFiles;

public class HomeHeaderPage 
{

	WebDriver driver;
	
	public HomeHeaderPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void click_investerslink() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("Home_Header_Invester_xpath"))).click();
	}
	
		
}
