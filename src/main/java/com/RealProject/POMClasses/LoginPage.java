package com.RealProject.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	private WebDriver driver;
	@FindBy(xpath="//input[@data-test='username']")
	private WebElement username;
	@FindBy(xpath="//input[@data-test='password']")
	private WebElement password;
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement login;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void unserid()
	{
		username.sendKeys("problem_user");
	}
	public void pass()
	{
		password.sendKeys("secret_sauce");
	}
	public void loginbutton()
	{
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
	

}
