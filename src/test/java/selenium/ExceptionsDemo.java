package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionsDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		//driver.switchTo().frame("abccc");
		//driver.switchTo().window("abccddcd");
		//driver.switchTo().alert();
		WebElement elemet=driver.findElement(By.xpath("//*[text()='Elements']"));
		driver.navigate().refresh();
		elemet=driver.findElement(By.xpath("//*[text()='Elements']"));
		//elemet.click();
		elemet.click();
		driver.quit();
		

	}

}
