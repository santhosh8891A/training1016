package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/facebook.html");
		 List<WebElement> elements= driver.findElements(By.tagName("e"));		
		 //driver.findElement(By.tagName("e"));

	}

}
