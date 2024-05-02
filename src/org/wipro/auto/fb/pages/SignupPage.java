package org.wipro.auto.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.auto.fb.utilities.ReadPropFiles;

public class SignupPage 
{

	WebDriver driver;
	
	public SignupPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void click_createnewaccountbttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("login_createnewaccount_xpath"))).click();
	}

	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropFiles.readelement("Signup_firstname_name"))).sendKeys(fname);
	}
	
	public void dob_day(String day) throws Exception
	{
		Select dob_day1 = new Select(driver.findElement(By.name(ReadPropFiles.readelement("Signup_dob_day_name"))));
		dob_day1.selectByVisibleText(day);
		
	}
	
	public void dob_month(String month) throws Exception
	{
		Select dob_mnoth1 = new Select(driver.findElement(By.name(ReadPropFiles.readelement("Signup_dob_month_name"))));
		dob_mnoth1.selectByVisibleText(month);
		
	}
	
	
	
	
	public void click_signupbttn() throws Exception
	{
		driver.findElement(By.name(ReadPropFiles.readelement("signup_submitbttn_name"))).click();
	}
	
}
