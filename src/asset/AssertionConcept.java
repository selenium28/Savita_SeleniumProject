package asset;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionConcept {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void testCase() {
		
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		WebElement clickOnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
		clickOnLogin.click();
		
		Assert.assertEquals("OrangeHRM", driver.getTitle(), "DashBorad Page");
		
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
