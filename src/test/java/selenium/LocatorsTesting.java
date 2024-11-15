package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTesting {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		// driver.navigate().to("https://www.orangehrm.com/en/pricing");
	//	 WebElement element=driver.findElement(By.name("CompanyName"));//Located the Element using name
		// WebElement element=driver.findElement(By.id("Form_getForm_CompanyName"));//Located the Element using id
	//	 element.sendKeys("SAMPLE");
		 
		// driver.findElement(By.className("action")).click();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		//driver.findElement(By.linkText("Agile Project")).click();
		//driver.findElement(By.partialLinkText("Agile Pr")).click();
		List<WebElement> elements=driver.findElements(By.tagName("div"));
		
		System.out.println(elements.size());
		
		for(WebElement ele:elements)
		{
			System.out.println(ele.getText());
		}

	}

}
