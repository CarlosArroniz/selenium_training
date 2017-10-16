package Config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserConfig {
	
	public static BrowConfig browser = BrowConfig.CHROME;
	public static Environment environment = Environment.QA;
	public static WebDriver webDriver;
	
	public static String BaseUrl = "";
	
	public enum BrowConfig
	{
		IE,
		CHROME,
		FIREFOX,
		EDGE,
		OPERA,
		SAFARI
	}
	
	public enum Environment
	{
		LOCALHOST,
		DEV,
		QA,
		PROD
	}
	
	public static void Init()
	{
		switch (environment)
		{
		case LOCALHOST:
			BaseUrl = "";
			break;
		case DEV:
			BaseUrl = "";
			break;
		case QA:
			BaseUrl = "http://store.demoqa.com/";
			break;
		case PROD:
			BaseUrl = "";
			break;
		}
		
		switch(browser)
		{
		case CHROME:
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			webDriver = new ChromeDriver();
			webDriver.manage().window().maximize();
			webDriver.get(BaseUrl);
			webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			break;
		default:
			break;
		}
	}
	
	public static void CleanUpDriver()
	{
		webDriver.manage().deleteAllCookies();
		webDriver.close();
		webDriver.quit();
	}
}
