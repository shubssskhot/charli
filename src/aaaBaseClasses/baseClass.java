package aaaBaseClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
	protected WebDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");		
	}
	public void waits(int a) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(a));
		
	}
	
	
}
