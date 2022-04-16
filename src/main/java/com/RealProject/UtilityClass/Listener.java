package com.RealProject.UtilityClass;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
	public void onTestStart(ITestResult result)
	{
		Reporter.log("Execution is started", true);
	}
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("TestCase is successfully passed", true);
	}
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("TestCase is Failed", true);
	}



}
