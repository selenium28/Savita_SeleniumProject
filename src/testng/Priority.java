package testng;

import org.testng.annotations.Test;

public class Priority {
	
  @Test (priority = 0)
  public void login() {
	  System.out.println("Login Page");
  }
  
  @Test (priority = 1)
  public void homePage() {
	  System.out.println("home Page");
  }
  
  @Test (priority = 2)
  public void productPage() {
	  System.out.println("product Page");
  }
  
}
