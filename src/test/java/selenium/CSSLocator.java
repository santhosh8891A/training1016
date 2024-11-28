package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.findElement(By.cssSelector(" input#email")).sendKeys("sample");
		//driver.findElement(By.cssSelector(" input.inputtext[name='pass']")).sendKeys("password");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("password");
	}

}
