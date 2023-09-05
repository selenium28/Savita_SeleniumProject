package annotation;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class BeforeSuiteAnnotation {
	WebDriver driver;
  
  @BeforeSuite (alwaysRun = true)
  public void initializationSuite() {
	   driver = new ChromeDriver();
  }

  @AfterSuite (alwaysRun = true)
  public void afterSuite() {
	  driver.close();
  }

}
