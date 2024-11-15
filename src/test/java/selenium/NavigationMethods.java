package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://www.orangehrm.com/");
		 //Thread.sleep(5000);
		 driver.navigate().refresh();
		 Thread.sleep(5000);
		 driver.navigate().back();
		 Thread.sleep(5000);
		 driver.navigate().forward();
		 
	}

}
