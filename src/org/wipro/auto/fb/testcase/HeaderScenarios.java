package org.wipro.auto.fb.testcase;

import org.testng.annotations.Test;
import org.wipro.auto.fb.basePkg.InitinateBrowser;
import org.wipro.auto.fb.pages.HomeHeaderPage;


public class HeaderScenarios extends InitinateBrowser
{

	@Test
	public void tc001_validheaderLinks() throws Exception
	{
		HomeHeaderPage links = new HomeHeaderPage(driver);
		
		links.click_investerslink();
	}
	
}
