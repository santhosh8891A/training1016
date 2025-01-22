package com.testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class TestLister implements ITestListener{

	public void onTestStart(ITestResult result) {
	   System.out.println("---Test Case Started---");
	  }

	   
	  public void onTestSuccess(ITestResult result) {
		  System.out.println("---Test Success---");
	  }

	 
	  public void onTestFailure(ITestResult result) {
		  System.out.println("---Test Failed---");
	  }

	 
	  public void onTestSkipped(ITestResult result) {
		  System.out.println("---Test Skipped---");
	  }

	
	 	   
	  public void onStart(ITestContext context) {
		  System.out.println("---Test Started---");
	  }
}
