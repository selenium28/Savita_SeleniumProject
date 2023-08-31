package testgroup;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class IncludeAndExclude {
	
  @Test (groups = {"smoke"})
  public void testCaseOne() {
	  System.out.println("Smoke Test");	  
  }
  
  @Test (groups = {"smoke"})
  public void testCaseTwo() {
	  System.out.println("Smoke Test");
  }
  
  @Test (groups = {"smoke" , "regression"})
  public void testCaseThree() {
	  System.out.println("Smoke & Regression Test");
  }
  
  @Test (groups = {"smoke" , "regression"})
  public void testCaseFour() {
	  System.out.println("Smoke & Regression Test"); 
  }
  
  @Test (groups = {"regression"})
  public void testCaseFive() {
	  System.out.println("Regression Test");
  }
  
  @Test (groups = {"regression"})
  public void testCaseSix() {
	  System.out.println("Regression Test");
  }
  
}
