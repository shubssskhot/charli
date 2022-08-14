package listnersnew;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listnersnew.Listners1.class)
public class TestClass {
  @Test (priority = 1)
  public void method1() {
	  Reporter.log("method1 exicuted succesfull",true);
  }
  @Test(dependsOnMethods = {"method1"})
  public void method2() {
	  Reporter.log("method2 exicuted succesfull",true);
  }
  @Test(dependsOnMethods = {"method2"})
  public void method3() {
	  Assert.fail();
	  Reporter.log("method3 exicuted succesfull",true);
  }
  @Test (dependsOnMethods = {"method3"})
  public void method4() {
	  Reporter.log("method4 exicuted succesfull",true);
  }
  @Test(dependsOnMethods = {"method4"})
  public void method5() {
	  Reporter.log("method5 exicuted succesfull",true);
  }
}
