package core;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		Locators: 1. id & 2. name
//		3. xPath: a. Absolute xPath b. Relative xPath
//		Text xPath
		WebElement loginTitle = driver.findElement(By.xpath("//*[text()='Login']"));
		loginTitle.isDisplayed();
//		Normal xPath 
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("Admin");
//		And xPath
		WebElement password = driver.findElement(By.xpath("//*[@name='password' and @type='password']"));
		password.sendKeys("admin123");
//		OR xPath
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit' or name = 'submit']"));
		loginButton.click();
//		Following
		WebElement PIMMenu = driver.findElement(By.xpath("//*[text()='Admin']//following::span[1]"));
		PIMMenu.isDisplayed();
//		Preceding
		WebElement Recruitment = driver.findElement(By.xpath("//*[text()='My Info']//preceding::span[1]"));
		Recruitment.isDisplayed();
		
//		4. CSS Selector
		WebElement login_css = driver.findElement(By.cssSelector("button[type='submit']"));
		login_css.click();
		
//		5. LinkText
		WebElement Facebook_forget = driver.findElement(By.linkText("Forgotten account?"));
		Facebook_forget.click();
		
//		6. Partial LinkText
		WebElement Facebook_forgett = driver.findElement(By.partialLinkText("Forgotten"));
		Facebook_forgett.click();
		
//		7. Tagname
		List<WebElement> faceBookUser = driver.findElements(By.tagName("input"));
		faceBookUser.clear();
		
//		8. Class Name
		WebElement faceBookpass = driver.findElement(By.className("inputtext _55r1 inputtext _1kbt inputtext _1kbt"));
		faceBookpass.click();
		
	}

}
