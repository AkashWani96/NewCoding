package com.RealProject.TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.RealProject.UtilityClass.Listener.class)
public class TC01LoginPageFuctionality extends TestBaseClass
{
	@Test
	public void LoginFuctionality()
	{
		String Expectedurl = "https://www.saucedemo.com/inventory.html";
		String Actualurl = driver.getCurrentUrl();
		Assert.assertEquals(Actualurl, Expectedurl);
		log.info("validate assertion");
	}

}
