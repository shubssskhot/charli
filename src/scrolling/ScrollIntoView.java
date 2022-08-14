package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		Thread.sleep(900);
		
		WebElement t = driver.findElement(By.xpath("//a[text()='Click to Start Selenium Practice Now']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(600);
		js.executeScript("arguments[0].scrollIntoView();",t);
		
	}

}
