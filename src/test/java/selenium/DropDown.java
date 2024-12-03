package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement element = driver.findElement(By.xpath("//select[@name='country']"));

		Select select = new Select(element);
		// select.selectByIndex(2);
		// select.selectByVisibleText("BARBADOS");
		// select.selectByValue("BARBADOS");

		List<WebElement> list = select.getOptions();

		for (WebElement ele : list) {
			System.out.println(ele.getText());
		}
	}

}
