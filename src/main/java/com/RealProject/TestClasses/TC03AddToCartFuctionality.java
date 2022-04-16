package com.RealProject.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.RealProject.POMClasses.HomePage;

@Listeners(com.RealProject.UtilityClass.Listener.class)
public class TC03AddToCartFuctionality extends TestBaseClass
{
	@Test
	public void AddToCartFuctionality()
	{
		HomePage hp = new HomePage(driver);
		hp.AddToCart();
		String ExpectedCount = "Remove";
		String ActualCount = hp.cartCount();
		Assert.assertEquals(ActualCount, ExpectedCount);
		log.info("validate add to cart funtionality");
		
	}


}
