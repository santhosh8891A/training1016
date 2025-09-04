package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNG extends Parent {
	
	//smoke
	@Test(groups={"smoke","regressoion"})
	public void firtMethod() {
		System.out.println("---This is a first Method--");
		///This is to test pull request
	}

	
	@Test(groups={"regressoion"})
	public void secondMEthod()
	{
		System.out.println("---This is a second Method--");
	}
	
	
	
}
