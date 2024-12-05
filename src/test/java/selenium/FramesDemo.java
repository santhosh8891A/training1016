package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		//Identify frame webelement
		WebElement frame=driver.findElement(By.id("frame1"));		
		//driver.switchTo().frame(frame);
		
		//Switch to frame using index
		//driver.switchTo().frame(2);
		
		//Switch to frame using id or name
		driver.switchTo().frame("frame1");
		String text=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[text()='Elements']")).click();
		
	}

}
