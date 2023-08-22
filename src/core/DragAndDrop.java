package core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		Handling iFrame 
		driver.switchTo().frame(0);
		
		WebElement dragSource = driver.findElement(By.id("draggable"));
		WebElement dragDestination = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(dragSource).moveToElement(dragDestination).release().perform();
		System.out.println("Drag and Drop action performed");

	}

}
