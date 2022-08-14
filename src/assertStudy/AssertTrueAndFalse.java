package assertStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueAndFalse {
  @Test
  public void f() {
	  boolean a=true;
	  boolean b=false;
	  
	  Assert.assertTrue(a);
	  Assert.assertFalse(a,"The given value of a is true");
  }
}
