package org.xyz.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchDataRuntime 
{
	WebDriver driver;
	
	
	@Test
	public void launchBrowser() throws Exception
	{
			driver= new ChromeDriver(); //launch the browser
			
			//Step 1
			String expURL = "https://www.facebook.com";
			
			driver.get(expURL); //pass the URL
			
			String actURL = driver.getCurrentUrl();
			System.out.println(actURL);
			
			//Assert.assertEquals(actURL, expURL, "this test case going to be fail");  //hard assertion
			
			SoftAssert sa= new SoftAssert();
			sa.assertEquals(actURL, expURL);
			
			System.out.println("this test case going to be fail");
			
			String expTitle = "Facebook – log in or sign up";
			
			String actTitle = driver.getTitle();
			System.out.println(actTitle);
			
			sa.assertEquals(actTitle, expTitle);
			
			//username textbox should present in the login page
			
			String ExpUsernameTextbox = "Email address or phone number";
			String ActUsernameTextbox = driver.findElement(By.id("email")).getAttribute("placeholder");
			System.out.println(ActUsernameTextbox);
			
			sa.assertEquals(ActUsernameTextbox, ExpUsernameTextbox);
			
			String logininbuttn = driver.findElement(By.name("login")).getText();
			System.out.println(logininbuttn);
			
			Point loginincoordinate = driver.findElement(By.name("login")).getLocation();
			System.out.println(loginincoordinate);
			
			//System.out.println(driver.getPageSource());
			
			sa.assertAll();
			
			
	}	
	
	

}
