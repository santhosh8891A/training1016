package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowsersTesting {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();	 
		
		
		String browser="firefox";
		if(browser.contentEquals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		
		driver.get("https://demoqa.com/buttons");
	}

}
