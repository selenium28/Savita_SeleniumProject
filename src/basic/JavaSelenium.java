package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaSelenium {
	public static WebDriver driver;  // Global

//	public static void main(String[] args) {
//		JavaSelenium objJavaSelenium = new JavaSelenium();
//		objJavaSelenium.launchBrowser();
//		JavaSelenium.login();
//		objJavaSelenium.closeBrowser();		
//
//	}
	
	@Test
	public void lauch() {
		JavaSelenium objJavaSelenium = new JavaSelenium();
		objJavaSelenium.launchBrowser();
		JavaSelenium.login();
		objJavaSelenium.closeBrowser();		

	}
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void login() {
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		WebElement clickOnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
		clickOnLogin.click();
	}
	
	public void closeBrowser() {
		driver.quit();
	}

}
