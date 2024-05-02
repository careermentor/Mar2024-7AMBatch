package org.wipro.auto.fb.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.wipro.auto.fb.basePkg.InitinateBrowser;
import org.wipro.auto.fb.datagenerators.TestDataGeneraor;
import org.wipro.auto.fb.pages.SignupPage;


public class SignupScenario_DDF extends InitinateBrowser
{

	@Test(dataProvider="email or phone",dataProviderClass=TestDataGeneraor.class)
	public void tc002_validsignupfunc(String ep) throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		
		sign.click_createnewaccountbttn();
		sign.enter_firstname("selenium");
		
		driver.findElement(By.name("reg_email__")).sendKeys(ep);
		
		sign.dob_day("10");
		sign.dob_month("Feb");
		
	
		
		sign.click_signupbttn();
			
	}
	
}
