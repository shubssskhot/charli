package dynamicElement;

import org.openqa.selenium.WebDriver;                    //to get views from flipkart
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElementHandeling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("");
		Thread.sleep(500);

		
	}

}
