package khotSelenium;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;


public class MyFirstSelenium1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		driver .get(" https://www.amazon.in/ ");
		
		Thread.sleep(2000);
		
		
	}
 
}


