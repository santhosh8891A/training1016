package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationTestibng {

	
	@Test
	@Parameters({"browser","title"})
	 public void checkboxTestinginChrome(String browser,String title) {
		WebDriver driver=null;
		
		if(browser.contentEquals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}
		
		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement element=driver.findElement(By.id("vfb-7-1"));
		
		if(element.isDisplayed())
		{
			element.click();
		}
		else
		{
			System.out.println("Element Not displayed");
		}
		Assert.assertEquals(title, driver.getTitle());
		
		
 }
}
