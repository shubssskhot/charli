package assertStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsAndNotequals {
  @Test
  public void f() {
	  String a="kolhapur";
	  String b="kolhapur";
	  @SuppressWarnings("unused")
	String c="Pune";
	 // Assert.assertEquals(a, b);
	  Assert.assertNotEquals(a, b, "The value of a and b is same");
  }
}
