package parallelAndserialExicution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookLogin {
  @Test
  public void f() {System.setProperty("webdriver.chrome.driver","E:\\selenium soft\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://facebook.com");
	
  }
}
