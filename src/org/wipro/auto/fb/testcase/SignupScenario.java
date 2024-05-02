package org.wipro.auto.fb.testcase;

import org.testng.annotations.Test;
import org.wipro.auto.fb.basePkg.InitinateBrowser;
import org.wipro.auto.fb.pages.SignupPage;


public class SignupScenario extends InitinateBrowser
{

	@Test
	public void tc002_validsignupfunc() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		
		sign.click_createnewaccountbttn();
		sign.enter_firstname("selenium");
		
		sign.dob_day("10");
		sign.dob_month("Feb");
		
	
		
		sign.click_signupbttn();
			
	}
	
}
