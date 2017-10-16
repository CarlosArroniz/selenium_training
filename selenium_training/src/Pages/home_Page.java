package Pages;

import org.openqa.selenium.By;

import Tests.TestBase;

public class home_Page extends TestBase
{
	public static final By cart = By.className("cart_icon");
	
	public static boolean click_CartIcon()
	{
		try {
			webDriver.findElement(cart);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
}
