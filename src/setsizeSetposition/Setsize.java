package setsizeSetposition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {					//size of browser

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(900);
		Dimension d =new Dimension(80, 880);
		
		
		driver.manage().window().setSize(d);
		
		
	}

}
