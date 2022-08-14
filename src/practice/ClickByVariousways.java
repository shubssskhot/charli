package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickByVariousways {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		Thread.sleep(900);
		JavascriptExecutor je = (JavascriptExecutor)driver;
		//je.executeScript("argument[0].click();",a);
		//je.executeScript(null, args);
	}

}
