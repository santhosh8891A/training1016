package selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		
		//Implicit wait or Global Wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("reveal")).click();
		//WebDriver Wait
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("revealed"))));		
		 
		
		   //Flunect wait
			FluentWait wait=new FluentWait(driver);
			wait.withTimeout(Duration.ofSeconds(5));
			wait.pollingEvery(Duration.ofSeconds(2));
			wait.ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("revealed"))));
			
			driver.findElement(By.id("revealed")).sendKeys("test");
	}

}
