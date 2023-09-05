package annotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BeforeClassAnnotation {
	
  @Test
  public void updateprofile() {
	  System.out.println("Test case 1: Update Profile");
  }
  
  @Test
  public void checkBalence() {
	  System.out.println("Test case 2: Check Balence");
  }
  
  @BeforeClass
  public void accountLogin() {
	  System.out.println("Before Class: Account Login");
  }

  @AfterClass
  public void accountLogout() {
	  System.out.println("After Class: Account Logout");
  }

}
