package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
//		ChromeDriver driver2 = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
//		WebDriver driver3 = new WebDriver(); We can't create object of interface
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
	}

}
