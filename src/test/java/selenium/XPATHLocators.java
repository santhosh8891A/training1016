package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATHLocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mngr317363");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("mngr317363");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
