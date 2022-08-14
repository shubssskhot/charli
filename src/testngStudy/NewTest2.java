package testngStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void f() {
  
  Reporter.log("welcome to TestNG");
  }
  @AfterClass
  public void a() {
	  Reporter.log("test case pass");
  }
  
}
