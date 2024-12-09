package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		//options.addArguments("headless");
		options.addArguments("incognito");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demoqa.com/buttons");
		
		System.out.println(driver.getTitle());
	}

}
