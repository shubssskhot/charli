package testngXMLStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	 @Test
	  public void f() {
		  Reporter.log("welcome to f", true);
	  }
	  @Test(groups =  {"sanity"})
	  public void g() {
		  Reporter.log("welcome to g", true);
	  }
	  @Test
	  public void h() {
		  Reporter.log("welcome to h", true);
	  }
	  @Test(groups =  {"sanity"})
	  public void i() {
		  Reporter.log("welcome to i", true);
	  }
	  @Test
	  public void j() {
		  Reporter.log("welcome to j", true);
	  }
}
