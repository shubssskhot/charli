package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest001 {
  @Test
  public void f() {
	  
	   System.setProperty("webdriver.gecko.driver", "E:\\selenium soft\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
  }
}
