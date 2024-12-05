package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		//Parnet window id
		String parentwindowid=driver.getWindowHandle();
		
		driver.findElement(By.id("tabButton")).click();
		
		//Fetch all opned window ids
		Set<String> windowids=driver.getWindowHandles();
		
		for(String id:windowids)
		{
			if(!parentwindowid.contentEquals(id))
			{
				driver.switchTo().window(id);
			}
		}
		
		String text=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);

		
	}

}
