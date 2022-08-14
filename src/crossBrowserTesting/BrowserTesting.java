package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserTesting {
	@Parameters("browser name")
	@Test
	public void f(String Brname) {
		WebDriver driver = null;

		if (Brname.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (Brname.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\selenium soft\\selenium\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.get("https://kite.zerodha.com/dashboard");
	}
}
