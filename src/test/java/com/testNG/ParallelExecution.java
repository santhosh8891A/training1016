package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
	
	@Test
	 public void checkboxTestinginChrome() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/radio.html");
			
		   // WebElement element=driver.findElement(By.id("vfb-6-0"));
			WebElement element=driver.findElement(By.id("vfb-7-1"));
			
			if(element.isDisplayed())
			{
				element.click();
			}
			else
			{
				System.out.println("Element Not displayed");
			}
			
			
	 }
	 
	@Test
	 public void checkboxTestinginEdge() {
			WebDriver driver=new EdgeDriver();
			driver.get("https://demo.guru99.com/test/radio.html");
			
		   // WebElement element=driver.findElement(By.id("vfb-6-0"));
			WebElement element=driver.findElement(By.id("vfb-7-1"));
			
			if(element.isDisplayed())
			{
				element.click();
			}
			else
			{
				System.out.println("Element Not displayed");
			}
			
	 }

}
