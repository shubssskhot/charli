package listnersnew;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void a() {
	  Reporter.log("Welcome to Demo1",true);
	  Assert.fail();
	  }
}

