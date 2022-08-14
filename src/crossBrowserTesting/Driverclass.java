package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Driverclass {
	 WebDriver driver;
	 
  @Test
  public void f() {
	  
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
  }
}
