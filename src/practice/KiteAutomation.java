package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(500);
		driver.findElement(By.id("userid")).sendKeys("ELR321");
		driver.findElement(By.id("password")).sendKeys("Dhana1111");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("pin")).sendKeys("982278");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1800);
		WebElement UID = driver.findElement(By.xpath("//span[@class='user-id']"));

		String expectedID = "ELR321";
		String actID = UID.getText();

		if (expectedID.equals(actID)) {
			System.out.println("TEST CASE PASS");
		} else {
			System.out.println("TEST CASE FAIL");

		}
		UID.click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		Thread.sleep(2500);
		driver.quit();

	}

}
