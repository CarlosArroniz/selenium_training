package Tests;
import org.testng.annotations.BeforeClass;

import Config.BrowserConfig;

import org.testng.annotations.AfterClass;

public class TestBase extends BrowserConfig {

	@BeforeClass
	public void beforeClass() 
	{
		browser = BrowConfig.CHROME;
		environment = Environment.QA;
		Init();
	}

	@AfterClass
	public void afterClass() 
	{
		BrowserConfig.CleanUpDriver();
	}
}
