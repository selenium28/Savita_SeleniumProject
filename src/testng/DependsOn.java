package testng;

import org.testng.annotations.Test;

public class DependsOn {
	
  @Test 
  public void loginMethod() {
	  System.out.println("Login method");   // Bug 
  }
  
  @Test (dependsOnMethods = "loginMethod")
  public void homePage() {
	  System.out.println("Home Page");
	  int a = 10;
	  int b = 0;
	  System.out.println(a/b);
	  
  }
  
  @Test (dependsOnMethods = "homePage")
  public void productPage() {
	  System.out.println("Product Page");
  }
  
  @Test (dependsOnMethods = "productPage")
  public void paymentPage() {
	  System.out.println("Payment Page");
  }
  
}
