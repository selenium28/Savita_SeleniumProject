package parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ChromeFirefoxBrowser {
	
	String browser = "firefox";
	WebDriver driver;
	
  @Test
  public void browserLaunch() {
	  if (browser.equals("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		  driver = new ChromeDriver();
		
	} else if (browser.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	  
	  driver.get("https://demo.guru99.com/test/delete_customer.php");
  }
}
