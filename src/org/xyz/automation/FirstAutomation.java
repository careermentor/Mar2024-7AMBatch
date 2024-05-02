package org.xyz.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomation 
{
	WebDriver driver;
	
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		//WebDriverManager.chromedriver().setup();
		
				
				ChromeDriver driver= new ChromeDriver();  //launch the browser
				
				driver.get("https://www.google.com/");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				Thread.sleep(5000);
				
				driver.navigate().to("https://www.facebook.com/");
				
				Thread.sleep(5000);
				
				driver.navigate().back();
				Thread.sleep(5000);
				driver.navigate().forward();
				Thread.sleep(5000);
				driver.navigate().refresh();
				Thread.sleep(5000);
				
				
				
				
			
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();  ///will close one window at a time
		driver.quit();
	}
	
	
	@Test
	public void loginPage()
	{
		
		driver.findElement(By.id("email")).sendKeys("user1@gmail.com");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("user2@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pass1234");
		
		driver.findElement(By.name("login")).click();
		
		
	}
	
	@Test
	public void signup() throws InterruptedException
	{
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		
		driver.findElement(By.name("websubmit")).click();
		
	}

}
