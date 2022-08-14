package khotSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
   import org.openqa.selenium.opera.OperaDriver;

@SuppressWarnings("deprecation")
public class edgedriver {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.opera.driver", "E:\\selenium soft\\selenium\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("https://www.demo.guru99.com/V4/");
		Thread.sleep(500);
		driver.findElement(By.name("uid")).sendKeys("mngr423878");
		driver.findElement(By.name("password")).sendKeys("ErynabY");
		driver.findElement(By.name("btnLogin")).click();

	}
}