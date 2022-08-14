package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice1 extends Driverclass {
	//WebDriver driver;
  @Test
  public void a(WebDriver driver) throws InterruptedException {
	  Driverclass non=new Driverclass();
	non.f();
	  
	 
	 driver.get("https://www.demo.guru99.com/V4/");
	 Thread.sleep(1000);
  }
  @Test
  public void b(WebDriver driver) {
	  driver.get("https://www.facebook.com");
  }
}
