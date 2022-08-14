package aaaBaseClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import aaaUtilityClasses.NewUtilityKite;

public class baseClassNew {
	protected WebDriver driver;
	public void launchBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get(NewUtilityKite.readDataFromPropertyFile("URL"));		
	}
	public void waits(int a) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(a));
		
	}
	
	
}
