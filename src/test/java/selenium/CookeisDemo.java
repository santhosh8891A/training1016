package selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookeisDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/cookie/selenium_cookie.php");

		driver.manage().deleteCookieNamed("_ga");
		
		Cookie cookie = new Cookie("testing", "testing");
		driver.manage().addCookie(cookie);
		
		Set<Cookie> cookies = driver.manage().getCookies();

		
		
		
		for (Cookie cookienew : cookies) {
			System.out.println(cookienew);
		}

	}

}
