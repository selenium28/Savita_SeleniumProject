package core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploading {

	public static void main(String[] args) {

		String url = "http://demo.guru99.com/test/upload/";

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement chooseFile = driver.findElement(By.id("uploadfile_0"));
		chooseFile.sendKeys("C:\\Users\\devid\\Desktop\\Ajay\\Ajayphoto.pdf");
		
		WebElement checkBox = driver.findElement(By.id("terms"));
		checkBox.click();
		
		WebElement submitButton = driver.findElement(By.id("submitbutton"));
		submitButton.click();
		
		WebElement validationmsg = driver.findElement(By.xpath("//*[text()='has been successfully uploaded.']"));
		validationmsg.isDisplayed();
		System.out.println(validationmsg);
		
	}

}
