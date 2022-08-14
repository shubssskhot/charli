package crossBrowserTesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class NewTest3 {
	public WebDriver driver;
  @Test
  public void f() {
	  driver = new FirefoxDriver();
	  //System.setProperty("webdriver.gecko.driver", "E:\\selenium soft\\selenium\\geckodriver.exe");
	  driver.get("https://kite.zerodha.com/dashboard");
  }
  @Test
  public void beforeMethod() {
	   driver = new FirefoxDriver();
	  driver.get("https://facebook.com");
  }

  
}
