package core;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {

	public static void main(String[] args) {
		String url = "https://demo.guru99.com/test/delete_customer.php";
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement cusID = driver.findElement(By.name("cusid"));
		cusID.clear();
		cusID.sendKeys("ABCD");
		
		WebElement submitButton = driver.findElement(By.name("submit"));
		submitButton.isDisplayed();
		submitButton.click();
		
		Alert alert = driver.switchTo().alert();
		String validationMessage = alert.getText();
		System.out.println(validationMessage);
		alert.accept();
//		alert.dismiss();
	
	}

}
