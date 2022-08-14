package assertStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullAndNotnull {
  @Test
  public void f() {
	  String a =null;
	  Assert.assertNull(a,"The given value of a is not NULL");
  }
}
