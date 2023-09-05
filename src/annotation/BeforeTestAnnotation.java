package annotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BeforeTestAnnotation {
  @Test
  public void login() {
	  System.out.println("TestCase1: Login");
  }
  
  @Test
  public void home() {
	  System.out.println("TestCase2: home");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

}
