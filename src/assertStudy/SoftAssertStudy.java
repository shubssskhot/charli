package assertStudy;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
  @Test
  public void f() {
	  String a ="kolhapur";
	  String b ="Pune";
	  String c ="kolhapur";
	  boolean d=false;
	  boolean e=true;
	  SoftAssert soft=new SoftAssert();
	  soft.assertEquals(a, c);
	  soft.assertNotEquals(a, b);
	  soft.assertNotNull(c, "Entered Value is null");
	  soft.assertFalse(d);
	  soft.assertTrue(e);
	  soft.assertAll();
	  
  }
}
