package testngStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class NewTest3 {
  @Test
  public void f() {
  }
  @Test
  public void beforeMethod() {
	  Reporter.log("before welcome",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("after welcome",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("before class welcome",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("after class welcome",true);
  }

}
