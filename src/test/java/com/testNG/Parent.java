package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Parent {
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("*****This is a Before Method**");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("*****This is a after Method**");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("*****This is a Before Class**");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("*****This is a after Class**");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("*****This is a Before Test**");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("*****This is a after Test**");
	}
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("*****This is a Before Suite**");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("*****This is a after Suite**");
	}

}
