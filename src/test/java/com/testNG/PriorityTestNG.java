package com.testNG;

import org.testng.annotations.Test;

public class PriorityTestNG {
	
	@Test(priority=-1)
	public void method()
	{
		System.out.println("This is a fifth method");
	}
	
	//smoke
	@Test(priority=1)
	public void method2()
	{
		System.out.println("This is a sixth method");
	}
	@Test
	public void method3()
	{
		System.out.println("This is a seventh method");
	}

	@Test(enabled=false)
	public void method4()
	{
		System.out.println("This is a eight method");
	}
}
