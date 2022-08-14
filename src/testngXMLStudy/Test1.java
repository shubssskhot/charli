package testngXMLStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
  @Test(groups = {"sanity"})
  public void a() {
	  Reporter.log("welcome to a", true);
  }
  @Test
  public void b() {
	  Reporter.log("welcome to b", true);
  }
  @Test
  public void c() {
	  Reporter.log("welcome to c", true);
  }
  @Test(groups = {"sanity"})
  public void d() {
	  Reporter.log("welcome to d", true);
  }
  @Test
  public void e() {
	  Reporter.log("welcome to e", true);
  }
}
