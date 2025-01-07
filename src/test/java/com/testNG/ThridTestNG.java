package com.testNG;

import org.testng.annotations.Test;

public class ThridTestNG extends Parent{
	
	@Test(groups={"regressoion"})
	public void method()
	{
		System.out.println("This is a fifth method");
	}
	
	//smoke
	@Test(groups={"smoke","regressoion"})
	public void method2()
	{
		System.out.println("This is a sixth method");
	}

}
