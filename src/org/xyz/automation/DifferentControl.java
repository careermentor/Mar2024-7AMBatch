package org.xyz.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentControl 
{
	WebDriver driver;
	
	
	@Test
	public void launchBrowser() throws Exception
	{
			driver= new ChromeDriver(); 
			driver.get("https://thetestingworld.com/testings/");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.name("fld_username")).sendKeys("selenium");
			driver.findElement(By.name("fld_username")).clear();
			driver.findElement(By.name("fld_username")).sendKeys("java");	
			
			Thread.sleep(5000);
			
			driver.findElement(By.cssSelector("[value='home']")).click();
			
			Thread.sleep(5000);
			
			System.out.println(driver.findElement(By.name("terms")).isSelected());
			
			driver.findElement(By.name("terms")).click();
			System.out.println(driver.findElement(By.name("terms")).isSelected());
			Thread.sleep(5000);
			
			//driver.findElement(By.className("displayPopup")).click();
			
			Select gen = new Select(driver.findElement(By.name("sex")));
			//gen.selectByIndex(1);
			//gen.selectByValue("2");
			gen.selectByVisibleText("Male");
			
			//gen.deselectAll();
			//gen.deselectByVisibleText("Female");
			
			WebElement abc = driver.findElement(By.name("country"));
			
			Select con = new Select(abc);
			con.selectByVisibleText("United States");
			
			Select st = new Select(driver.findElement(By.name("state")));
			
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			
			//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Arizona"));
			
			st.selectByVisibleText("Florida");
			
			Select ct = new Select(driver.findElement(By.name("city")));
			
			//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("cityId")), "Beach"));
			
			ct.selectByVisibleText("Orlando");
			
			
	}			

}
