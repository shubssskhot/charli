package testngStudy;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordsStudy {
	@Test(dependsOnMethods = "b")
	public void a() {

		Reporter.log("welcome to a");
	}

	@Test(priority = 1, invocationCount = 4)
	public void b() {
		Reporter.log("welcome to b");
	}

	@Test()
	public void c() {
		Reporter.log("welcome to c");
	}

	@Test(dependsOnMethods = "a")
	public void d() {
		Reporter.log("welcome to d");
	}

	@Test
	public void e() {
		Reporter.log("welcome to e");
	}

	@Test
	public void f() {
		Reporter.log("welcome to f");
	}

}
