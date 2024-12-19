package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotCapture {

	public static void main(String[] args) throws IOException {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/delete_customer.php");
		 driver.findElement(By.name("cusid")).sendKeys("123456");	     
		 driver.findElement(By.name("submit")).click();
		 Alert alert=driver.switchTo().alert();
		 TakesScreenshot screenshot=((TakesScreenshot)alert); 
		 File SrcFile=screenshot.getScreenshotAs(OutputType.FILE); 
		 File DestFile=new File("F:\\Automation Training\\Rough\\sample12190948.png");
		 FileUtils.copyFile(SrcFile, DestFile); 
		 


	}

}
