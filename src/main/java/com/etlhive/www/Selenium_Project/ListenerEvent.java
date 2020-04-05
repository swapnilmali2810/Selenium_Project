package com.etlhive.www.Selenium_Project;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerEvent implements ITestListener{

	public void onFinish(ITestContext arg0) {
		System.out.println("Test Execution finished");
		Reporter.log("Test execution finished");
		
	}

	public void onStart(ITestContext arg0) {
		System.out.println("Test Execution started");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("Test case started");
		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Test case is passed");
		
	}
	
	

}
