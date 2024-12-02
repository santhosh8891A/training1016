package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxandRadioButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		//WebElement element = driver.findElement(By.xpath("//input[@value='checkbox1']"));

		WebElement element = driver.findElement(By.xpath("//input[@value='Option 1']"));
		if (element.isDisplayed() && element.isEnabled()) {
			
			if(!element.isSelected())
			{
				element.click(); 
			}
			
		}

		else {
			System.out.println("Not displayed");
		}

	}

}
