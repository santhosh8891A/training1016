package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class SSLCertificate {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.cacert.org/");


	}

}
