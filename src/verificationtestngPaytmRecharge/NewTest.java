package verificationtestngPaytmRecharge;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {System.setProperty("webdriver.chrome.driver","E:\\selenium soft\\selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver ();
	
	driver.get("");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
  }
}
