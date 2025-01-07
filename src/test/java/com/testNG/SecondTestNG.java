package com.testNG;

import org.testng.annotations.Test;

public class SecondTestNG extends Parent  {
	
	@Test(groups={ "regressoion"})
	public void firtMethod() {
		System.out.println("---This is a third Method--");
	}

	
	//smoke
	@Test(groups={"smoke","regressoion"})
	public void secondMEthod()
	{
		System.out.println("---This is a fourth Method--");
	}

}
