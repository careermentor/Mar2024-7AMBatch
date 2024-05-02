package org.wipro.auto.fb.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.wipro.auto.fb.basePkg.InitinateBrowser;
import org.wipro.auto.fb.pages.LoginPage;


public class LoginScenario extends InitinateBrowser
{

	@Test
	public void tc001_validcredentialLogin() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username("user1");
		login.enter_password("pass1");
		login.click_loginbttn();
			
	}
	
}
