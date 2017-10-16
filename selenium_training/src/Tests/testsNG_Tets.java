package Tests;

import org.testng.annotations.*;

import Pages.home_Page;

public class testsNG_Tets extends TestBase
{
	@Test
	public void demo_Test_QA()
	{
		try
		{
			home_Page.click_CartIcon();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}