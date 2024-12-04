package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver=new ChromeDriver();
		
		// Actions action=new Actions(driver);
		// action.moveToElement(driver.findElement(By.xpath("//*[text()='Fashion']"))).build().perform();
		 //action.contextClick().build().perform();

			
		//driver.manage().window().maximize();
		//String url = "https://selenium08.blogspot.com/2020/01/click-and-hold.html";
		//String url="https://selenium08.blogspot.com/2020/01/drag-drop.html";
		//driver.get(url);
		//WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']"));
	//	WebElement titleB = driver.findElement(By.xpath("//li[text()= 'B']"));
		
	  //  actions.moveToElement(titleC).build().perform();
	//    Thread.sleep(5000);
	//	actions.clickAndHold().moveToElement(titleB).click().perform();
		
	//	WebElement elemet=driver.findElement(By.xpath("//*[@name='2873846720740225467']//following-sibling::h3"));
	//	actions.moveToElement(elemet).doubleClick().build().perform();
	    
	    
	   // WebElement srceElement=driver.findElement(By.id("draggable"));
	   // WebElement targetElement=driver.findElement(By.id("droppable"));
	  //  actions.dragAndDrop(srceElement, targetElement).build().perform();
		
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com");
	    Actions actions = new Actions(driver);
	    driver.findElement(By.className("Pke_EE")).sendKeys(Keys.SHIFT+"books");
	    actions.keyDown(Keys.ENTER).build().perform();
	}

}
