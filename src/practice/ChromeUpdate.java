package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeUpdate {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		

		Thread.sleep(1500);
		driver.get("chrome://settings/");
		driver.manage().window().fullscreen();
		

		Thread.sleep(1000);

		driver.findElement(By.id("autofill")).click();
		
		Thread.sleep(500);
		//WebElement msg = driver.findElement(By.id("updateStatusMessage"));
		//System.out.println(msg.getText());

	}

}
