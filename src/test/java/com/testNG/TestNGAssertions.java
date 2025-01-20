package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertions {
	
	@Test
	public void testAssertion()
	{
		String actualTitle="Test";
		String expTitle="Test";		
		Assert.assertTrue(actualTitle.contentEquals(expTitle));
		
	}

}
