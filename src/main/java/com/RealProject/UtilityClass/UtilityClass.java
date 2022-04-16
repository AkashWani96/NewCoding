package com.RealProject.UtilityClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	public static void ScreenShotMethod(WebDriver driver) throws IOException
	{
	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
	
	TakesScreenshot ts= (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./ScreenShots//"+sdf.format(d)+".jpg");
	FileHandler.copy(source, dest);
	}

}
