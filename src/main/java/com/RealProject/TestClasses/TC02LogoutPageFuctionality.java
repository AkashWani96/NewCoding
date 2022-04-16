package com.RealProject.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Listeners(com.RealProject.UtilityClass.Listener.class)
public class TC02LogoutPageFuctionality extends TestBaseClass
{
	@Test
	public void logoutFuctionality()
	{
		String ExpectedTitle = "Swag Labs";
		String ActualTitle = driver.getTitle();
		//Soft Assertion
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActualTitle, ExpectedTitle);
		log.info("validate soft assertion");
		//Hard Assertion
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		log.info("validate hard assertion");
	}
	

}
