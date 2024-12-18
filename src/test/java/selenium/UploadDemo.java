package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDemo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = null;
		driver=new ChromeDriver();
		
		//driver.findElement(By.id("uploadFile")).sendKeys("F:\\Automation Training\\Rough\\Test1021.png");
		
		
		//Thread.sleep(5000);
		driver.get("https://demoqa.com/upload-download");//Open the application
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@for='uploadFile']")).click();//Problem with the element
		StringSelection s = new StringSelection("F:\\Automation Training\\Rough\\sample.png");
		// Clipboard copy
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null); 
		Thread.sleep(2000);
		// Robot object creation
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		//releasing ctrl+v
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		//pressing enter
		r.keyPress(KeyEvent.VK_ENTER);
		//releasing enter
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
