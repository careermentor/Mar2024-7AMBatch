package org.wipro.auto.fb.testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.auto.fb.basePkg.InitinateBrowser;
import org.wipro.auto.fb.datagenerators.TestDataGeneraor;
import org.wipro.auto.fb.pages.LoginPage;


public class LoginScenario_DDF extends InitinateBrowser
{

	@Test(dataProvider="staticdata",dataProviderClass=TestDataGeneraor.class)
	public void tc001_validcredentialLogin(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
			
	}
	

	
}
