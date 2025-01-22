package com.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTesting {
	
	
	@Test(dataProvider="dataprovider")
	public void testCase(String par1,String par2)
	{
		System.out.println(par1+"  "+par2);
	}
	
	
	@DataProvider(name="dataprovider")
	public Object[][] dpMethod()
	{
		return new Object[][] {{"Firstrowfirstcolumn","Firstrowsecondcolumn"},
								{"secondrowfirstcolumn","seocndrowsecondcolumn"},
								{"thirdrowfirstcolumn","thirdrowsecondcolumn"}};
		
	}

}
