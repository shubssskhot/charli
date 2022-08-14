package khotSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;    //GURU99 001

public class guru991 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/V4/");
		Thread.sleep(500);
		driver.findElement(By.name("uid")).sendKeys("mngr423878");
		driver.findElement(By.name("password")).sendKeys("ErynabY");
		driver.findElement(By.name("btnLogin")).click();

	}
}