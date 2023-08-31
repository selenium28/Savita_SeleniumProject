package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class EnableAndDisable {
	
  @Test (enabled = true)
  public void testCaseOne() {
	  System.out.println("testCaseOne");
  }
  
  @Test (enabled = true)
  public void testCaseTwo() {
	  System.out.println("testCaseTwo");
  }
  
  @Test (enabled = false)
  public void regression() {
	  System.out.println("regression");
  }
  
  @Test(enabled = false)
  public void regressionn() {
	  System.out.println("regression");
  }
  
  @Test (enabled = false)
  public void loginTestCase() {
	  System.out.println("testCaseFive");
  } 

}
