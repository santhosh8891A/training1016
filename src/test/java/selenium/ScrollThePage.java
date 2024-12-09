package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollThePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Scroll down
		//js.executeScript("window.scrollBy(0,1000)");
		
		//Thread.sleep(2000);
		//Scroll up
		//js.executeScript("window.scrollBy(0,-500)");
		
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		WebElement element=driver.findElement(By.xpath("//*[text()='Book Store Application']"));
		
		js.executeScript("arguments[0].scrollIntoView();",element );
		
		element.click();


	}

}
