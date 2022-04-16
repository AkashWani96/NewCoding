package com.RealProject.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.RealProject.POMClasses.HomePage;
import com.RealProject.POMClasses.LoginPage;
import com.RealProject.UtilityClass.UtilityClass;

public class TestBaseClass extends UtilityClass
{
	WebDriver driver;
	Logger log;
	@Parameters("browserName")
	@BeforeClass
	public void setup(String browserName) throws IOException
	{
		 log = Logger.getLogger("RealProject1");
	// class of loh4j,       method
		PropertyConfigurator.configure("log4j.properties");
	//   class of log4j        method
		if (browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Automation Testing\\"
				+ "04. Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("Chrome browser is opend");
		}
		else if (browserName.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", "D:\\Software Testing\\Automation Testing\\"
				+ "04. Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		log.info("firefox browser is opend");
		}
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		log.info("URL is opend");
		UtilityClass.ScreenShotMethod(driver);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	@BeforeMethod
	public void login() throws IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.unserid();
		log.info("Enter username");
		lp.pass();
		log.info("Enter password");
		lp.loginbutton();
		UtilityClass.ScreenShotMethod(driver);
		log.info("click on login button");
	}
	
	@AfterMethod
	public void tearDown() throws IOException
	{
		HomePage hp = new HomePage(driver);
		hp.SetDashboard();
		log.info("click on dashboard");
		hp.logoutButton();
		log.info("click on logout button");
		
	}
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
		log.info("Browser will close");
	}

}
