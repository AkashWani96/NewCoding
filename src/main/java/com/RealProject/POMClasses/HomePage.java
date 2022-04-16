package com.RealProject.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	private WebDriver driver;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement dashboard;
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logout;
	@FindBy (xpath="(//button[text()='Add to cart'])[1]")
	private WebElement Cart;
	@FindBy (xpath="(//button[text()='Remove']")
	                 
	private WebElement count;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void SetDashboard()
	{
		dashboard.click();
	}
	public void logoutButton()
	{
		logout.click();
	}
	public void AddToCart()
	{
		Cart.click();
	}
	public String cartCount()
	{
		return count.getText();
	}
//	public void button()
//	{
//		Cart.click();
//	}
	
	

}
