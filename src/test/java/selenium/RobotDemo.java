package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotDemo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = null;
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");//Open the amazon application
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("mngr317363");//Books saeach
		driver.findElement(By.id("pass")).sendKeys("password");//Books saeach
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		robot.mousePress(KeyEvent.BUTTON3_DOWN_MASK);
		robot.mouseRelease(KeyEvent.BUTTON3_DOWN_MASK);

	}

}
